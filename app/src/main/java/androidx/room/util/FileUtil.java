package androidx.room.util;

import android.os.Build;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public class FileUtil {
    public static void copy(ReadableByteChannel readableByteChannel, FileChannel fileChannel) throws Throwable {
        ReadableByteChannel readableByteChannel2;
        FileChannel fileChannel2;
        try {
            try {
                if (Build.VERSION.SDK_INT > 23) {
                    readableByteChannel2 = readableByteChannel;
                    fileChannel2 = fileChannel;
                    fileChannel2.transferFrom(readableByteChannel2, 0L, Long.MAX_VALUE);
                } else {
                    readableByteChannel2 = readableByteChannel;
                    fileChannel2 = fileChannel;
                    InputStream inputStreamNewInputStream = Channels.newInputStream(readableByteChannel2);
                    OutputStream outputStreamNewOutputStream = Channels.newOutputStream(fileChannel2);
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = inputStreamNewInputStream.read(bArr);
                        if (i <= 0) {
                            break;
                        } else {
                            outputStreamNewOutputStream.write(bArr, 0, i);
                        }
                    }
                }
                fileChannel2.force(false);
                readableByteChannel2.close();
                fileChannel2.close();
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                readableByteChannel2.close();
                fileChannel2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            readableByteChannel2 = readableByteChannel;
            fileChannel2 = fileChannel;
        }
    }

    private FileUtil() {
    }
}
