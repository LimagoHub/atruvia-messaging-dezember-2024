package de.atruvia.kreditrantragregistrierung.feature.domain.services;

public class KreditantragServiceException extends  Exception{
    public KreditantragServiceException() {
    }

    public KreditantragServiceException(String message) {
        super(message);
    }

    public KreditantragServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public KreditantragServiceException(Throwable cause) {
        super(cause);
    }

    public KreditantragServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
