import org.apache.spark.{SparkFiles, sql}
import org.apache.spark.sql.SparkSession

object BootcampAssessment extends App {

  // Create a SparkSession
  val spark = SparkSession
    .builder()
    .appName("Bootcamp Assessment")
    .config("spark.master", "local")
    .getOrCreate()

  uploadFiles()

  def uploadFiles() = {

    val df_drivers = spark.read
      .format("csv")
      .option("header", "true")
      .option("inferSchema", "true")
      .load(SparkFiles.get("hdfs:///tmp/drivers.csv"))

    val df_timesheet = spark.read
      .format("csv")
      .option("header", "true")
      .option("inferSchema", "true")
      .load(SparkFiles.get("hdfs:///tmp/timesheet.csv"))

    val df_truck_event_text_partition = spark.read
      .format("csv")
      .option("header", "true")
      .option("inferSchema", "true")
      .load(SparkFiles.get("hdfs://tmp/truck_event_text_partition.csv"))

    // Save as tables on hive
    df_drivers.write.mode("overwrite").saveAsTable("drivers")
    df_timesheet.write.mode("overwrite").saveAsTable("timesheet")
    df_truck_event_text_partition.write.mode("overwrite").saveAsTable("truck_event_text_partition")

    outputAggregatedInformation(df_drivers, df_timesheet)
  }

  def outputAggregatedInformation(df_drivers:sql.DataFrame, df_timesheet:sql.DataFrame): Unit = {
    val df_timesheet_aggregated = df_timesheet.groupBy("driverId").sum("hours-logged", "miles-logged")
    val joined = df_drivers.join(df_timesheet_aggregated,"driverId")
    val final_df = joined.drop("ssn","location","certified","wage-plan")
    final_df.show()
  }

  def createHBaseTable(): Unit = {
    //TODO: implement!
  }

  def loadCSV(): Unit = {
    //TODO: implement!
  }

  def addFourthElement(): Unit = {
    //TODO: implement!
  }

  def updateFourthElement(): Unit = {
    //TODO: implement!
  }

  def outputInformation(): Unit = {
    //TODO: implement!
  }

}
