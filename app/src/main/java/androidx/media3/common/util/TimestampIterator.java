package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public interface TimestampIterator {

    /* JADX INFO: renamed from: androidx.media3.common.util.TimestampIterator$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static long $default$getLastTimestampUs(TimestampIterator _this) {
            return -9223372036854775807L;
        }
    }

    TimestampIterator copyOf();

    long getLastTimestampUs();

    boolean hasNext();

    long next();
}
