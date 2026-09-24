package com.fyber.inneractive.sdk.external;

/* JADX INFO: loaded from: classes4.dex */
public class InneractiveVideoError extends InneractiveError {

    /* JADX INFO: renamed from: a */
    public final Error f17934a;

    /* JADX INFO: renamed from: b */
    public final Throwable f17935b;

    public enum Error {
        ERROR_NO_MEDIA_FILES("ErrorNoMediaFiles", true),
        ERROR_FAILED_PLAYING_MEDIA_FILE("ErrorPlayingMediaFile", false),
        ERROR_FAILED_PLAYING_ALL_MEDIA_FILES("ErrorPlayingAllMediaFile", true),
        ERROR_PRE_BUFFER_TIMEOUT("ErrorPreBufferTimeout", false),
        ERROR_BUFFER_TIMEOUT("ErrorBufferTimeout", false);

        private String errorString;
        private boolean isFatal;

        Error(String str, boolean z) {
            this.errorString = str;
            this.isFatal = z;
        }

        public String getErrorString() {
            return this.errorString;
        }

        public boolean isFatal() {
            return this.isFatal;
        }
    }

    public InneractiveVideoError(Error error) {
        this.f17934a = error;
    }

    public InneractiveVideoError(Error error, Throwable th) {
        this(error);
        this.f17935b = th;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveError
    public String description() {
        if (this.f17935b == null) {
            return this.f17934a.getErrorString();
        }
        return this.f17934a.getErrorString() + ": " + this.f17935b;
    }

    public Throwable getCause() {
        return this.f17935b;
    }

    public Error getPlayerError() {
        return this.f17934a;
    }
}
