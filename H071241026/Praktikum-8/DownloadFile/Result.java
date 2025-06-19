package DownloadFile;

public class Result {
    int fileId;  //default
    String threadName;
    int duration;
    String status;

    //metode khusus yg dijalankan saat objek result dibuat dengan new Result()
    Result(int fileId, String threadName, int duration, String status) {
        this.fileId = fileId;
        this.threadName = threadName;
        this.duration = duration;
        this.status = status;
    }
}