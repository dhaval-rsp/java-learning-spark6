public class P4_DownloadThenProcess {
    public static void main(String[] args) {

        DownloadThread download = new DownloadThread();

        download.start();

        try {
            // Main thread waits until download thread finishes
            download.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        // After download is complete
        System.out.println("Processing downloaded file");
    }
}

class DownloadThread extends Thread {
    public void run() {
        System.out.println("Downloading file...");

        try {
            Thread.sleep(5000); // time taken to download
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Download completed");
    }
}

/*
## Program 4: Download Then Process

Create DownloadThread .
It should print:
	Downloading file...
	Download completed

Main thread should wait for download thread using join() .
After that print:
	Processing downloaded file
 */

/*
2. print stament one by one "Downloading file...", "Download completed", "Processing downloaded file"
3. no output cannot be changed because for child thread the print statement is in order
And for main thread we have used join statement which means it will wait for download/child thread to finish its work then proceed to print main thread stament
4. main thread printing last statement Processing downloaded file and first two statement printed by download thead
7. in real life this is useful for this purpose only to make sure file should open once it is downloaded not before that
*/

