package com.google.android.play.core.assetpacks;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.play.core.assetpacks.internal.C10116o;
import com.ironsource.C11661S5;
import com.ironsource.C11794a2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.em */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C10069em {

    /* JADX INFO: renamed from: a */
    private static final C10116o f22366a = new C10116o("SliceMetadataManager");

    /* JADX INFO: renamed from: c */
    private final C9983bh f22368c;

    /* JADX INFO: renamed from: d */
    private final String f22369d;

    /* JADX INFO: renamed from: e */
    private final int f22370e;

    /* JADX INFO: renamed from: f */
    private final long f22371f;

    /* JADX INFO: renamed from: g */
    private final String f22372g;

    /* JADX INFO: renamed from: b */
    private final byte[] f22367b = new byte[8192];

    /* JADX INFO: renamed from: h */
    private int f22373h = -1;

    C10069em(C9983bh c9983bh, String str, int i, long j, String str2) {
        this.f22368c = c9983bh;
        this.f22369d = str;
        this.f22370e = i;
        this.f22371f = j;
        this.f22372g = str2;
    }

    /* JADX INFO: renamed from: n */
    private final File m22679n() {
        File fileM22571o = this.f22368c.m22571o(this.f22369d, this.f22370e, this.f22371f, this.f22372g);
        if (!fileM22571o.exists()) {
            fileM22571o.mkdirs();
        }
        return fileM22571o;
    }

    /* JADX INFO: renamed from: o */
    private final File m22680o() throws IOException {
        File fileM22570n = this.f22368c.m22570n(this.f22369d, this.f22370e, this.f22371f, this.f22372g);
        fileM22570n.getParentFile().mkdirs();
        fileM22570n.createNewFile();
        return fileM22570n;
    }

    /* JADX INFO: renamed from: a */
    final int m22681a() throws IOException {
        File fileM22570n = this.f22368c.m22570n(this.f22369d, this.f22370e, this.f22371f, this.f22372g);
        if (!fileM22570n.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(fileM22570n);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", C11794a2.f26725f)) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new C10013ck("Slice checkpoint file corrupt.");
        } catch (Throwable th) {
            try {
                fileInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    final AbstractC10068el m22682b() throws IOException {
        File fileM22570n = this.f22368c.m22570n(this.f22369d, this.f22370e, this.f22371f, this.f22372g);
        if (!fileM22570n.exists()) {
            throw new C10013ck("Slice checkpoint file does not exist.");
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(fileM22570n);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                throw new C10013ck("Slice checkpoint file corrupt.");
            }
            try {
                int i = Integer.parseInt(properties.getProperty("fileStatus"));
                String property = properties.getProperty(C11661S5.c.f25653b);
                long j = Long.parseLong(properties.getProperty("fileOffset", C11794a2.f26725f));
                long j2 = Long.parseLong(properties.getProperty("remainingBytes", C11794a2.f26725f));
                int i2 = Integer.parseInt(properties.getProperty("previousChunk"));
                this.f22373h = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                return new C9991bp(i, property, j, j2, i2);
            } catch (NumberFormatException e) {
                throw new C10013ck("Slice checkpoint file corrupt.", e);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    final File m22683c() {
        return new File(m22679n(), String.format("%s-NAM.dat", Integer.valueOf(this.f22373h)));
    }

    /* JADX INFO: renamed from: d */
    final void m22684d(InputStream inputStream, long j) throws IOException {
        int i;
        RandomAccessFile randomAccessFile = new RandomAccessFile(m22683c(), "rw");
        try {
            randomAccessFile.seek(j);
            do {
                i = inputStream.read(this.f22367b);
                if (i > 0) {
                    randomAccessFile.write(this.f22367b, 0, i);
                }
            } while (i == 8192);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    final void m22685e(long j, byte[] bArr, int i, int i2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(m22683c(), "rw");
        try {
            randomAccessFile.seek(j);
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    final void m22686f(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", ExifInterface.GPS_MEASUREMENT_3D);
        properties.put("fileOffset", String.valueOf(m22683c().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f22373h));
        FileOutputStream fileOutputStream = new FileOutputStream(m22680o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    final void m22687g(String str, long j, long j2, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put(C11661S5.c.f25653b, str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f22373h));
        FileOutputStream fileOutputStream = new FileOutputStream(m22680o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    final void m22688h(byte[] bArr, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f22373h));
        FileOutputStream fileOutputStream = new FileOutputStream(m22680o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File fileM22569m = this.f22368c.m22569m(this.f22369d, this.f22370e, this.f22371f, this.f22372g);
            if (fileM22569m.exists()) {
                fileM22569m.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileM22569m);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream2.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            try {
                fileOutputStream.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    final void m22689i(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f22373h));
        FileOutputStream fileOutputStream = new FileOutputStream(m22680o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    final void m22690j(byte[] bArr) throws IOException {
        this.f22373h++;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(m22679n(), String.format("%s-LFH.dat", Integer.valueOf(this.f22373h))));
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            throw new C10013ck("Could not write metadata file.", e);
        }
    }

    /* JADX INFO: renamed from: k */
    final void m22691k(byte[] bArr, InputStream inputStream) throws IOException {
        this.f22373h++;
        FileOutputStream fileOutputStream = new FileOutputStream(m22683c());
        try {
            fileOutputStream.write(bArr);
            int i = inputStream.read(this.f22367b);
            while (i > 0) {
                fileOutputStream.write(this.f22367b, 0, i);
                i = inputStream.read(this.f22367b);
            }
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    final void m22692l(byte[] bArr, int i, int i2) throws IOException {
        this.f22373h++;
        FileOutputStream fileOutputStream = new FileOutputStream(m22683c());
        try {
            fileOutputStream.write(bArr, 0, i2);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    final boolean m22693m() {
        File fileM22570n = this.f22368c.m22570n(this.f22369d, this.f22370e, this.f22371f, this.f22372g);
        if (!fileM22570n.exists()) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(fileM22570n);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") != null) {
                    return Integer.parseInt(properties.getProperty("fileStatus")) == 4;
                }
                f22366a.m22750b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                return false;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException e) {
            f22366a.m22750b("Could not read checkpoint while checking if extraction finished. %s", e);
            return false;
        }
    }
}
