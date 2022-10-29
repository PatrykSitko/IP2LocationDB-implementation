//Change to apropriate package name.
//Main project is not for public view.
package be.patryksitko.contest.ip2location.com.component.exception;

public class DownloadLimitException extends RuntimeException {
    public DownloadLimitException() {
        super("Download limit reached: \"THIS FILE CAN ONLY BE DOWNLOADED 5 TIMES PER HOUR\".");
    }
}
