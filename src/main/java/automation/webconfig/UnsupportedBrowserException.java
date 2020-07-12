package automation.webconfig;

public class UnsupportedBrowserException extends AssertionError {

    public UnsupportedBrowserException(String browser) {
        super("Unsupported browser " +  browser + "!");
    }
}