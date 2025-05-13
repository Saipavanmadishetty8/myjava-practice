public class DownloadTask implements Runnable {
    private String fileName;

    public DownloadTask(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println("Downloading " + fileName + " started by " + Thread.currentThread().getName());
        try {
            // Simulate time delay (2 seconds per file)
            for (int i = 1; i <= 5; i++) {
                System.out.println(fileName + " - " + (i * 20) + "% downloaded");
                Thread.sleep(500); // 0.5 sec pause for each chunk
            }
        } catch (InterruptedException e) {
            System.out.println("Download interrupted: " + fileName);
        }
        System.out.println("Downloading " + fileName + " completed by " + Thread.currentThread().getName());
    }
}
