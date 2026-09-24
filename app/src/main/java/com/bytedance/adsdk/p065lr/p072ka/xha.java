package com.bytedance.adsdk.p065lr.p072ka;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class xha {

    /* JADX INFO: renamed from: ri */
    private final InterfaceC2116fi f5115ri;

    public xha(InterfaceC2116fi interfaceC2116fi) {
        this.f5115ri = interfaceC2116fi;
    }

    /* JADX INFO: renamed from: lr */
    private File m7007lr(String str) throws FileNotFoundException {
        File file = new File(m7008ri(), m7009ri(str, EnumC2117ik.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(m7008ri(), m7009ri(str, EnumC2117ik.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    private File m7008ri() {
        File fileMo6601ri = this.f5115ri.mo6601ri();
        if (fileMo6601ri.isFile()) {
            fileMo6601ri.delete();
        }
        if (!fileMo6601ri.exists()) {
            fileMo6601ri.mkdirs();
        }
        return fileMo6601ri;
    }

    /* JADX INFO: renamed from: ri */
    private static String m7009ri(String str, EnumC2117ik enumC2117ik, boolean z) {
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? enumC2117ik.m6995ri() : enumC2117ik.f5111ik);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ri */
    Pair<EnumC2117ik, InputStream> m7010ri(String str) {
        try {
            File fileM7007lr = m7007lr(str);
            if (fileM7007lr == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileM7007lr);
            EnumC2117ik enumC2117ik = fileM7007lr.getAbsolutePath().endsWith(".zip") ? EnumC2117ik.ZIP : EnumC2117ik.JSON;
            fileM7007lr.getAbsolutePath();
            return new Pair<>(enumC2117ik, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    File m7011ri(String str, InputStream inputStream, EnumC2117ik enumC2117ik) throws IOException {
        File file = new File(m7008ri(), m7009ri(str, enumC2117ik, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ri */
    void m7012ri(String str, EnumC2117ik enumC2117ik) {
        File file = new File(m7008ri(), m7009ri(str, enumC2117ik, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        file2.toString();
        if (zRenameTo) {
            return;
        }
        file.getAbsolutePath();
        file2.getAbsolutePath();
    }
}
