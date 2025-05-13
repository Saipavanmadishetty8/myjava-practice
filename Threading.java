public class Threading {
    public static void main(String[] args) {
        String[] files = {"file1.mp4", "file2.zip", "file3.pdf", "file4.jpg", "file5.mp3"};

        for (String file : files) {
            Thread t = new Thread(new DownloadTask(file));
            System.out.println("Main started on thread: " + Thread.currentThread().getName());

            t.start(); // Starts a new thread
        }

        System.out.println("All downloads started. Main thread ends.");
    }
}
