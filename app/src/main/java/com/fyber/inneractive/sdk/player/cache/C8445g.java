package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C11744X3;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.cache.g */
/* JADX INFO: loaded from: classes4.dex */
public final class C8445g implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: p */
    public static final Pattern f18785p = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: q */
    public static final C8440b f18786q = new C8440b();

    /* JADX INFO: renamed from: a */
    public final File f18787a;

    /* JADX INFO: renamed from: b */
    public final File f18788b;

    /* JADX INFO: renamed from: c */
    public final File f18789c;

    /* JADX INFO: renamed from: d */
    public final File f18790d;

    /* JADX INFO: renamed from: f */
    public final long f18792f;

    /* JADX INFO: renamed from: i */
    public BufferedWriter f18795i;

    /* JADX INFO: renamed from: k */
    public int f18797k;

    /* JADX INFO: renamed from: l */
    public InterfaceC8444f f18798l;

    /* JADX INFO: renamed from: h */
    public long f18794h = 0;

    /* JADX INFO: renamed from: j */
    public final LinkedHashMap f18796j = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: m */
    public long f18799m = 0;

    /* JADX INFO: renamed from: n */
    public final ThreadPoolExecutor f18800n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: o */
    public final CallableC8439a f18801o = new CallableC8439a(this);

    /* JADX INFO: renamed from: e */
    public final int f18791e = 0;

    /* JADX INFO: renamed from: g */
    public final int f18793g = 1;

    public C8445g(File file, long j) {
        this.f18787a = file;
        this.f18788b = new File(file, "journal");
        this.f18789c = new File(file, "journal.tmp");
        this.f18790d = new File(file, "journal.bkp");
        this.f18792f = j;
    }

    /* JADX INFO: renamed from: a */
    public static C8445g m20819a(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file3)) {
                throw new IOException();
            }
        }
        C8445g c8445g = new C8445g(file, j);
        if (c8445g.f18788b.exists()) {
            try {
                c8445g.m20824b();
                c8445g.m20823a();
                return c8445g;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                IAlog.m21949e("DiskLruCache delete cache", new Object[0]);
                c8445g.close();
                AbstractC8450l.m20833a(c8445g.f18787a);
            }
        }
        file.mkdirs();
        C8445g c8445g2 = new C8445g(file, j);
        c8445g2.m20826c();
        return c8445g2;
    }

    /* JADX INFO: renamed from: a */
    public static void m20820a(C8445g c8445g, C8442d c8442d, boolean z) {
        int i;
        synchronized (c8445g) {
            C8443e c8443e = c8442d.f18776a;
            if (c8443e.f18783d != c8442d) {
                throw new IllegalStateException();
            }
            if (z && !c8443e.f18782c) {
                for (int i2 = 0; i2 < c8445g.f18793g; i2++) {
                    if (!c8442d.f18777b[i2]) {
                        m20820a(c8442d.f18779d, c8442d, false);
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                    }
                    if (!c8443e.m20818b(i2).exists()) {
                        m20820a(c8442d.f18779d, c8442d, false);
                        return;
                    }
                }
            }
            for (int i3 = 0; i3 < c8445g.f18793g; i3++) {
                File fileM20818b = c8443e.m20818b(i3);
                if (!z) {
                    m20821a(fileM20818b);
                } else if (fileM20818b.exists()) {
                    File fileM20817a = c8443e.m20817a(i3);
                    fileM20818b.renameTo(fileM20817a);
                    long j = c8443e.f18781b[i3];
                    long length = fileM20817a.length();
                    c8443e.f18781b[i3] = length;
                    c8445g.f18794h = (c8445g.f18794h - j) + length;
                }
            }
            c8445g.f18797k++;
            c8443e.f18783d = null;
            if (c8443e.f18782c || z) {
                c8443e.f18782c = true;
                BufferedWriter bufferedWriter = c8445g.f18795i;
                StringBuilder sb = new StringBuilder("CLEAN ");
                sb.append(c8443e.f18780a);
                StringBuilder sb2 = new StringBuilder();
                for (long j2 : c8443e.f18781b) {
                    sb2.append(' ');
                    sb2.append(j2);
                }
                sb.append(sb2.toString());
                sb.append('\n');
                bufferedWriter.write(sb.toString());
                if (z) {
                    c8445g.f18799m++;
                }
            } else {
                c8445g.f18796j.remove(c8443e.f18780a);
                c8445g.f18795i.write("REMOVE " + c8443e.f18780a + '\n');
            }
            c8445g.f18795i.flush();
            if (c8445g.f18794h > c8445g.f18792f || ((i = c8445g.f18797k) >= 2000 && i >= c8445g.f18796j.size())) {
                c8445g.f18800n.submit(c8445g.f18801o);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m20821a(File file) throws IOException {
        IAlog.m21949e("DiskLruCache deleteIfExists - %s", file);
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: a */
    public final C8442d m20822a(String str) {
        synchronized (this) {
            if (this.f18795i == null) {
                throw new IllegalStateException("cache is closed");
            }
            if (!f18785p.matcher(str).matches()) {
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            }
            C8443e c8443e = (C8443e) this.f18796j.get(str);
            if (c8443e == null) {
                c8443e = new C8443e(this, str);
                this.f18796j.put(str, c8443e);
            } else if (c8443e.f18783d != null) {
                return null;
            }
            C8442d c8442d = new C8442d(this, c8443e);
            c8443e.f18783d = c8442d;
            this.f18795i.write("DIRTY " + str + '\n');
            this.f18795i.flush();
            return c8442d;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20823a() throws IOException {
        m20821a(this.f18789c);
        Iterator it = this.f18796j.values().iterator();
        while (it.hasNext()) {
            C8443e c8443e = (C8443e) it.next();
            int i = 0;
            if (c8443e.f18783d == null) {
                while (i < this.f18793g) {
                    this.f18794h += c8443e.f18781b[i];
                    i++;
                }
            } else {
                c8443e.f18783d = null;
                while (i < this.f18793g) {
                    m20821a(c8443e.m20817a(i));
                    m20821a(c8443e.m20818b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m20824b() {
        FileInputStream fileInputStream = new FileInputStream(this.f18788b);
        Charset charset = AbstractC8450l.f18809a;
        C8449k c8449k = new C8449k(fileInputStream);
        try {
            String strM20832a = c8449k.m20832a();
            String strM20832a2 = c8449k.m20832a();
            String strM20832a3 = c8449k.m20832a();
            String strM20832a4 = c8449k.m20832a();
            String strM20832a5 = c8449k.m20832a();
            if (!"libcore.io.DiskLruCache".equals(strM20832a) || !"1".equals(strM20832a2) || !Integer.toString(this.f18791e).equals(strM20832a3) || !Integer.toString(this.f18793g).equals(strM20832a4) || !"".equals(strM20832a5)) {
                throw new IOException("unexpected journal header: [" + strM20832a + ", " + strM20832a2 + ", " + strM20832a4 + ", " + strM20832a5 + C11744X3.j.f26440e);
            }
            int i = 0;
            while (true) {
                try {
                    m20825b(c8449k.m20832a());
                    i++;
                } catch (EOFException unused) {
                    this.f18797k = i - this.f18796j.size();
                    if (c8449k.f18808e == -1) {
                        m20826c();
                    } else {
                        this.f18795i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f18788b, true), AbstractC8450l.f18809a));
                    }
                    try {
                        c8449k.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                c8449k.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m20825b(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f18796j.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C8443e c8443e = (C8443e) this.f18796j.get(strSubstring);
        if (c8443e == null) {
            c8443e = new C8443e(this, strSubstring);
            this.f18796j.put(strSubstring, c8443e);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c8443e.f18783d = new C8442d(this, c8443e);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        c8443e.f18782c = true;
        c8443e.f18783d = null;
        if (strArrSplit.length != c8443e.f18784e.f18793g) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                c8443e.f18781b[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m20826c() {
        BufferedWriter bufferedWriter = this.f18795i;
        if (bufferedWriter != null) {
            bufferedWriter.close();
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f18789c), AbstractC8450l.f18809a));
        try {
            bufferedWriter2.write("libcore.io.DiskLruCache");
            bufferedWriter2.write("\n");
            bufferedWriter2.write("1");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f18791e));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f18793g));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (C8443e c8443e : this.f18796j.values()) {
                if (c8443e.f18783d != null) {
                    bufferedWriter2.write("DIRTY " + c8443e.f18780a + '\n');
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("CLEAN ");
                    sb.append(c8443e.f18780a);
                    StringBuilder sb2 = new StringBuilder();
                    for (long j : c8443e.f18781b) {
                        sb2.append(' ');
                        sb2.append(j);
                    }
                    sb.append(sb2.toString());
                    sb.append('\n');
                    bufferedWriter2.write(sb.toString());
                }
            }
            bufferedWriter2.close();
            if (this.f18788b.exists()) {
                File file = this.f18788b;
                File file2 = this.f18790d;
                m20821a(file2);
                if (!file.renameTo(file2)) {
                    throw new IOException();
                }
            }
            if (!this.f18789c.renameTo(this.f18788b)) {
                throw new IOException();
            }
            this.f18790d.delete();
            this.f18795i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f18788b, true), AbstractC8450l.f18809a));
        } catch (Throwable th) {
            bufferedWriter2.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m20827c(String str) {
        IAlog.m21949e("DiskLruCache remove %s", str);
        if (this.f18795i == null) {
            throw new IllegalStateException("cache is closed");
        }
        if (!f18785p.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
        C8443e c8443e = (C8443e) this.f18796j.get(str);
        if (c8443e != null && c8443e.f18783d == null) {
            for (int i = 0; i < this.f18793g; i++) {
                File fileM20817a = c8443e.m20817a(i);
                if (fileM20817a.exists() && !fileM20817a.delete()) {
                    throw new IOException("failed to delete " + fileM20817a);
                }
                long j = this.f18794h;
                long[] jArr = c8443e.f18781b;
                this.f18794h = j - jArr[i];
                jArr[i] = 0;
            }
            this.f18797k++;
            this.f18795i.append((CharSequence) ("REMOVE " + str + '\n'));
            this.f18796j.remove(str);
            int i2 = this.f18797k;
            if (i2 >= 2000 && i2 >= this.f18796j.size()) {
                this.f18800n.submit(this.f18801o);
            }
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f18795i == null) {
            return;
        }
        Iterator it = new ArrayList(this.f18796j.values()).iterator();
        while (it.hasNext()) {
            C8442d c8442d = ((C8443e) it.next()).f18783d;
            if (c8442d != null) {
                m20820a(c8442d.f18779d, c8442d, false);
            }
        }
        m20828d();
        this.f18795i.close();
        this.f18795i = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m20828d() {
        while (this.f18794h > this.f18792f) {
            String str = (String) ((Map.Entry) this.f18796j.entrySet().iterator().next()).getKey();
            InterfaceC8444f interfaceC8444f = this.f18798l;
            if (interfaceC8444f == null) {
                m20827c(str);
            } else if (interfaceC8444f.mo20726a(str)) {
                m20827c(str);
            } else {
                boolean zM20827c = false;
                for (String str2 : this.f18796j.keySet()) {
                    if (this.f18798l.mo20726a(str2)) {
                        zM20827c |= m20827c(str2);
                    }
                }
                if (!zM20827c) {
                    return;
                }
            }
        }
    }
}
