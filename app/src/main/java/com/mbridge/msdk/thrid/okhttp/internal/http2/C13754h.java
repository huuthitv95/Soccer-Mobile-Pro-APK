package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import com.mbridge.msdk.thrid.okio.C13793c;
import com.mbridge.msdk.thrid.okio.C13796f;
import com.mbridge.msdk.thrid.okio.C13810t;
import com.mbridge.msdk.thrid.okio.InterfaceC13795e;
import com.mbridge.msdk.thrid.okio.InterfaceC13809s;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UShort;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.h */
/* JADX INFO: compiled from: Http2Reader.java */
/* JADX INFO: loaded from: classes7.dex */
final class C13754h implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: e */
    static final Logger f39037e = Logger.getLogger(C13751e.class.getName());

    /* JADX INFO: renamed from: a */
    private final InterfaceC13795e f39038a;

    /* JADX INFO: renamed from: b */
    private final a f39039b;

    /* JADX INFO: renamed from: c */
    private final boolean f39040c;

    /* JADX INFO: renamed from: d */
    final C13750d.a f39041d;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.h$a */
    /* JADX INFO: compiled from: Http2Reader.java */
    static final class a implements InterfaceC13809s, AutoCloseable {

        /* JADX INFO: renamed from: a */
        private final InterfaceC13795e f39042a;

        /* JADX INFO: renamed from: b */
        int f39043b;

        /* JADX INFO: renamed from: c */
        byte f39044c;

        /* JADX INFO: renamed from: d */
        int f39045d;

        /* JADX INFO: renamed from: e */
        int f39046e;

        /* JADX INFO: renamed from: f */
        short f39047f;

        a(InterfaceC13795e interfaceC13795e) {
            this.f39042a = interfaceC13795e;
        }

        /* JADX INFO: renamed from: d */
        private void m40531d() throws IOException {
            int i = this.f39045d;
            int iM40517a = C13754h.m40517a(this.f39042a);
            this.f39046e = iM40517a;
            this.f39043b = iM40517a;
            byte b = (byte) (this.f39042a.readByte() & 255);
            this.f39044c = (byte) (this.f39042a.readByte() & 255);
            Logger logger = C13754h.f39037e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C13751e.m40461a(true, this.f39045d, this.f39043b, b, this.f39044c));
            }
            int i2 = this.f39042a.readInt() & Integer.MAX_VALUE;
            this.f39045d = i2;
            if (b != 9) {
                throw C13751e.m40462b("%s != TYPE_CONTINUATION", Byte.valueOf(b));
            }
            if (i2 != i) {
                throw C13751e.m40462b("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s
        /* JADX INFO: renamed from: b */
        public long mo40427b(C13793c c13793c, long j) throws IOException {
            while (true) {
                int i = this.f39046e;
                if (i != 0) {
                    long jMo40427b = this.f39042a.mo40427b(c13793c, Math.min(j, i));
                    if (jMo40427b == -1) {
                        return -1L;
                    }
                    this.f39046e = (int) (((long) this.f39046e) - jMo40427b);
                    return jMo40427b;
                }
                this.f39042a.skip(this.f39047f);
                this.f39047f = (short) 0;
                if ((this.f39044c & 4) != 0) {
                    return -1L;
                }
                m40531d();
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s
        /* JADX INFO: renamed from: b */
        public C13810t mo40428b() {
            return this.f39042a.mo40428b();
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.h$b */
    /* JADX INFO: compiled from: Http2Reader.java */
    interface b {
        /* JADX INFO: renamed from: a */
        void mo40505a();

        /* JADX INFO: renamed from: a */
        void mo40506a(int i, int i2, int i3, boolean z);

        /* JADX INFO: renamed from: a */
        void mo40507a(int i, int i2, List<C13749c> list) throws IOException;

        /* JADX INFO: renamed from: a */
        void mo40508a(int i, long j);

        /* JADX INFO: renamed from: a */
        void mo40509a(int i, EnumC13748b enumC13748b);

        /* JADX INFO: renamed from: a */
        void mo40510a(int i, EnumC13748b enumC13748b, C13796f c13796f);

        /* JADX INFO: renamed from: a */
        void mo40511a(boolean z, int i, int i2);

        /* JADX INFO: renamed from: a */
        void mo40512a(boolean z, int i, int i2, List<C13749c> list);

        /* JADX INFO: renamed from: a */
        void mo40513a(boolean z, int i, InterfaceC13795e interfaceC13795e, int i2) throws IOException;

        /* JADX INFO: renamed from: a */
        void mo40514a(boolean z, C13759m c13759m);
    }

    C13754h(InterfaceC13795e interfaceC13795e, boolean z) {
        this.f39038a = interfaceC13795e;
        this.f39040c = z;
        a aVar = new a(interfaceC13795e);
        this.f39039b = aVar;
        this.f39041d = new C13750d.a(4096, aVar);
    }

    /* JADX INFO: renamed from: a */
    static int m40516a(int i, byte b2, short s) throws IOException {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw C13751e.m40462b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: a */
    static int m40517a(InterfaceC13795e interfaceC13795e) throws IOException {
        return (interfaceC13795e.readByte() & 255) | ((interfaceC13795e.readByte() & 255) << 16) | ((interfaceC13795e.readByte() & 255) << 8);
    }

    /* JADX INFO: renamed from: a */
    private List<C13749c> m40518a(int i, short s, byte b2, int i2) throws IOException {
        a aVar = this.f39039b;
        aVar.f39046e = i;
        aVar.f39043b = i;
        aVar.f39047f = s;
        aVar.f39044c = b2;
        aVar.f39045d = i2;
        this.f39041d.m40450f();
        return this.f39041d.m40448c();
    }

    /* JADX INFO: renamed from: a */
    private void m40519a(b bVar, int i) throws IOException {
        int i2 = this.f39038a.readInt();
        bVar.mo40506a(i, i2 & Integer.MAX_VALUE, (this.f39038a.readByte() & 255) + 1, (Integer.MIN_VALUE & i2) != 0);
    }

    /* JADX INFO: renamed from: a */
    private void m40520a(b bVar, int i, byte b2, int i2) throws IOException {
        if (i2 == 0) {
            throw C13751e.m40462b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        }
        boolean z = (b2 & 1) != 0;
        if ((b2 & 32) != 0) {
            throw C13751e.m40462b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        short s = (b2 & 8) != 0 ? (short) (this.f39038a.readByte() & 255) : (short) 0;
        bVar.mo40513a(z, i2, this.f39038a, m40516a(i, b2, s));
        this.f39038a.skip(s);
    }

    /* JADX INFO: renamed from: b */
    private void m40521b(b bVar, int i, byte b2, int i2) throws IOException {
        if (i < 8) {
            throw C13751e.m40462b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
        }
        if (i2 != 0) {
            throw C13751e.m40462b("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        int i3 = this.f39038a.readInt();
        int i4 = this.f39038a.readInt();
        int i5 = i - 8;
        EnumC13748b enumC13748bM40431a = EnumC13748b.m40431a(i4);
        if (enumC13748bM40431a == null) {
            throw C13751e.m40462b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i4));
        }
        C13796f c13796fMo40880b = C13796f.f39309e;
        if (i5 > 0) {
            c13796fMo40880b = this.f39038a.mo40880b(i5);
        }
        bVar.mo40510a(i3, enumC13748bM40431a, c13796fMo40880b);
    }

    /* JADX INFO: renamed from: c */
    private void m40522c(b bVar, int i, byte b2, int i2) throws IOException {
        if (i2 == 0) {
            throw C13751e.m40462b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }
        boolean z = (b2 & 1) != 0;
        short s = (b2 & 8) != 0 ? (short) (this.f39038a.readByte() & 255) : (short) 0;
        if ((b2 & 32) != 0) {
            m40519a(bVar, i2);
            i -= 5;
        }
        bVar.mo40512a(z, i2, -1, m40518a(m40516a(i, b2, s), s, b2, i2));
    }

    /* JADX INFO: renamed from: d */
    private void m40523d(b bVar, int i, byte b2, int i2) throws IOException {
        if (i != 8) {
            throw C13751e.m40462b("TYPE_PING length != 8: %s", Integer.valueOf(i));
        }
        if (i2 != 0) {
            throw C13751e.m40462b("TYPE_PING streamId != 0", new Object[0]);
        }
        bVar.mo40511a((b2 & 1) != 0, this.f39038a.readInt(), this.f39038a.readInt());
    }

    /* JADX INFO: renamed from: e */
    private void m40524e(b bVar, int i, byte b2, int i2) throws IOException {
        if (i != 5) {
            throw C13751e.m40462b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
        }
        if (i2 == 0) {
            throw C13751e.m40462b("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
        m40519a(bVar, i2);
    }

    /* JADX INFO: renamed from: f */
    private void m40525f(b bVar, int i, byte b2, int i2) throws IOException {
        if (i2 == 0) {
            throw C13751e.m40462b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        short s = (b2 & 8) != 0 ? (short) (this.f39038a.readByte() & 255) : (short) 0;
        bVar.mo40507a(i2, this.f39038a.readInt() & Integer.MAX_VALUE, m40518a(m40516a(i - 4, b2, s), s, b2, i2));
    }

    /* JADX INFO: renamed from: g */
    private void m40526g(b bVar, int i, byte b2, int i2) throws IOException {
        if (i != 4) {
            throw C13751e.m40462b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
        }
        if (i2 == 0) {
            throw C13751e.m40462b("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        int i3 = this.f39038a.readInt();
        EnumC13748b enumC13748bM40431a = EnumC13748b.m40431a(i3);
        if (enumC13748bM40431a == null) {
            throw C13751e.m40462b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i3));
        }
        bVar.mo40509a(i2, enumC13748bM40431a);
    }

    /* JADX INFO: renamed from: h */
    private void m40527h(b bVar, int i, byte b2, int i2) throws IOException {
        if (i2 != 0) {
            throw C13751e.m40462b("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((b2 & 1) != 0) {
            if (i != 0) {
                throw C13751e.m40462b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            bVar.mo40505a();
            return;
        }
        if (i % 6 != 0) {
            throw C13751e.m40462b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
        }
        C13759m c13759m = new C13759m();
        for (int i3 = 0; i3 < i; i3 += 6) {
            int i4 = this.f39038a.readShort() & UShort.MAX_VALUE;
            int i5 = this.f39038a.readInt();
            if (i4 == 2) {
                if (i5 != 0 && i5 != 1) {
                    throw C13751e.m40462b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                }
            } else if (i4 == 3) {
                i4 = 4;
            } else if (i4 != 4) {
                if (i4 == 5 && (i5 < 16384 || i5 > 16777215)) {
                    throw C13751e.m40462b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i5));
                }
            } else {
                if (i5 < 0) {
                    throw C13751e.m40462b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                }
                i4 = 7;
            }
            c13759m.m40586a(i4, i5);
        }
        bVar.mo40514a(false, c13759m);
    }

    /* JADX INFO: renamed from: i */
    private void m40528i(b bVar, int i, byte b2, int i2) throws IOException {
        if (i != 4) {
            throw C13751e.m40462b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        }
        long j = ((long) this.f39038a.readInt()) & 2147483647L;
        if (j == 0) {
            throw C13751e.m40462b("windowSizeIncrement was 0", Long.valueOf(j));
        }
        bVar.mo40508a(i2, j);
    }

    /* JADX INFO: renamed from: a */
    public void m40529a(b bVar) throws IOException {
        if (this.f39040c) {
            if (!m40530a(true, bVar)) {
                throw C13751e.m40462b("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        InterfaceC13795e interfaceC13795e = this.f39038a;
        C13796f c13796f = C13751e.f38952a;
        C13796f c13796fMo40880b = interfaceC13795e.mo40880b(c13796f.mo40923j());
        Logger logger = f39037e;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C13723c.m40272a("<< CONNECTION %s", c13796fMo40880b.mo40920g()));
        }
        if (!c13796f.equals(c13796fMo40880b)) {
            throw C13751e.m40462b("Expected a connection header but was %s", c13796fMo40880b.mo40926m());
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m40530a(boolean z, b bVar) throws IOException {
        try {
            this.f39038a.mo40889e(9L);
            int iM40517a = m40517a(this.f39038a);
            if (iM40517a < 0 || iM40517a > 16384) {
                throw C13751e.m40462b("FRAME_SIZE_ERROR: %s", Integer.valueOf(iM40517a));
            }
            byte b2 = (byte) (this.f39038a.readByte() & 255);
            if (z && b2 != 4) {
                throw C13751e.m40462b("Expected a SETTINGS frame but was %s", Byte.valueOf(b2));
            }
            byte b3 = (byte) (this.f39038a.readByte() & 255);
            int i = this.f39038a.readInt() & Integer.MAX_VALUE;
            Logger logger = f39037e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C13751e.m40461a(true, i, iM40517a, b2, b3));
            }
            switch (b2) {
                case 0:
                    m40520a(bVar, iM40517a, b3, i);
                    return true;
                case 1:
                    m40522c(bVar, iM40517a, b3, i);
                    return true;
                case 2:
                    m40524e(bVar, iM40517a, b3, i);
                    return true;
                case 3:
                    m40526g(bVar, iM40517a, b3, i);
                    return true;
                case 4:
                    m40527h(bVar, iM40517a, b3, i);
                    return true;
                case 5:
                    m40525f(bVar, iM40517a, b3, i);
                    return true;
                case 6:
                    m40523d(bVar, iM40517a, b3, i);
                    return true;
                case 7:
                    m40521b(bVar, iM40517a, b3, i);
                    return true;
                case 8:
                    m40528i(bVar, iM40517a, b3, i);
                    return true;
                default:
                    this.f39038a.skip(iM40517a);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f39038a.close();
    }
}
