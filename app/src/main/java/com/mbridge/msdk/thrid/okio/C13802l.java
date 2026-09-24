package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.l */
/* JADX INFO: compiled from: Okio.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13802l {

    /* JADX INFO: renamed from: a */
    static final Logger f39325a = Logger.getLogger(C13802l.class.getName());

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.l$a */
    /* JADX INFO: compiled from: Okio.java */
    static class a implements InterfaceC13808r, AutoCloseable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13810t f39326a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ OutputStream f39327b;

        a(C13810t c13810t, OutputStream outputStream) {
            this.f39326a = c13810t;
            this.f39327b = outputStream;
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r
        /* JADX INFO: renamed from: a */
        public void mo40370a(C13793c c13793c, long j) throws IOException {
            C13811u.m40969a(c13793c.f39306b, 0L, j);
            while (j > 0) {
                this.f39326a.mo40935e();
                C13805o c13805o = c13793c.f39305a;
                int iMin = (int) Math.min(j, c13805o.f39340c - c13805o.f39339b);
                this.f39327b.write(c13805o.f39338a, c13805o.f39339b, iMin);
                int i = c13805o.f39339b + iMin;
                c13805o.f39339b = i;
                long j2 = iMin;
                j -= j2;
                c13793c.f39306b -= j2;
                if (i == c13805o.f39340c) {
                    c13793c.f39305a = c13805o.m40960b();
                    C13806p.m40963a(c13805o);
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r
        /* JADX INFO: renamed from: b */
        public C13810t mo40429b() {
            return this.f39326a;
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f39327b.close();
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r, java.io.Flushable
        public void flush() throws IOException {
            this.f39327b.flush();
        }

        public String toString() {
            return "sink(" + this.f39327b + ")";
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.l$b */
    /* JADX INFO: compiled from: Okio.java */
    static class b implements InterfaceC13809s, AutoCloseable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13810t f39328a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InputStream f39329b;

        b(C13810t c13810t, InputStream inputStream) {
            this.f39328a = c13810t;
            this.f39329b = inputStream;
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s
        /* JADX INFO: renamed from: b */
        public long mo40427b(C13793c c13793c, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (j == 0) {
                return 0L;
            }
            try {
                this.f39328a.mo40935e();
                C13805o c13805oM40881b = c13793c.m40881b(1);
                int i = this.f39329b.read(c13805oM40881b.f39338a, c13805oM40881b.f39340c, (int) Math.min(j, 8192 - c13805oM40881b.f39340c));
                if (i == -1) {
                    return -1L;
                }
                c13805oM40881b.f39340c += i;
                long j2 = i;
                c13793c.f39306b += j2;
                return j2;
            } catch (AssertionError e) {
                if (C13802l.m40949a(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s
        /* JADX INFO: renamed from: b */
        public C13810t mo40428b() {
            return this.f39328a;
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f39329b.close();
        }

        public String toString() {
            return "source(" + this.f39329b + ")";
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.l$c */
    /* JADX INFO: compiled from: Okio.java */
    static class c extends C13791a {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Socket f39330k;

        c(Socket socket) {
            this.f39330k = socket;
        }

        @Override // com.mbridge.msdk.thrid.okio.C13791a
        /* JADX INFO: renamed from: b */
        protected IOException mo40556b(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.mbridge.msdk.thrid.okio.C13791a
        /* JADX INFO: renamed from: j */
        protected void mo40557j() {
            try {
                this.f39330k.close();
            } catch (AssertionError e) {
                if (!C13802l.m40949a(e)) {
                    throw e;
                }
                C13802l.f39325a.log(Level.WARNING, "Failed to close timed out socket " + this.f39330k, (Throwable) e);
            } catch (Exception e2) {
                C13802l.f39325a.log(Level.WARNING, "Failed to close timed out socket " + this.f39330k, (Throwable) e2);
            }
        }
    }

    private C13802l() {
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC13794d m40943a(InterfaceC13808r interfaceC13808r) {
        return new C13803m(interfaceC13808r);
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC13795e m40944a(InterfaceC13809s interfaceC13809s) {
        return new C13804n(interfaceC13809s);
    }

    /* JADX INFO: renamed from: a */
    private static InterfaceC13808r m40945a(OutputStream outputStream, C13810t c13810t) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (c13810t != null) {
            return new a(c13810t, outputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC13808r m40946a(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        }
        C13791a c13791aM40951c = m40951c(socket);
        return c13791aM40951c.m40854a(m40945a(socket.getOutputStream(), c13791aM40951c));
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC13809s m40947a(InputStream inputStream) {
        return m40948a(inputStream, new C13810t());
    }

    /* JADX INFO: renamed from: a */
    private static InterfaceC13809s m40948a(InputStream inputStream, C13810t c13810t) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (c13810t != null) {
            return new b(c13810t, inputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    /* JADX INFO: renamed from: a */
    static boolean m40949a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC13809s m40950b(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        C13791a c13791aM40951c = m40951c(socket);
        return c13791aM40951c.m40855a(m40948a(socket.getInputStream(), c13791aM40951c));
    }

    /* JADX INFO: renamed from: c */
    private static C13791a m40951c(Socket socket) {
        return new c(socket);
    }
}
