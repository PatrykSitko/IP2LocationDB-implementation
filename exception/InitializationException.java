//Change to apropriate package name.
//Main project is not for public view.
package be.patryksitko.contest.ip2location.com.component.exception;

public class InitializationException extends RuntimeException {
    public InitializationException() {
        super("Could not initialize databases.");
    }
}
