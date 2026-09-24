package com.fyber.inneractive.sdk.protobuf;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C8946h extends AbstractC8952i {

    /* JADX INFO: renamed from: a */
    public final boolean f21020a = true;

    /* JADX INFO: renamed from: b */
    public final byte[] f21021b;

    /* JADX INFO: renamed from: c */
    public int f21022c;

    /* JADX INFO: renamed from: d */
    public int f21023d;

    /* JADX INFO: renamed from: e */
    public int f21024e;

    /* JADX INFO: renamed from: f */
    public int f21025f;

    public C8946h(ByteBuffer byteBuffer) {
        this.f21021b = byteBuffer.array();
        this.f21022c = byteBuffer.position() + byteBuffer.arrayOffset();
        this.f21023d = byteBuffer.limit() + byteBuffer.arrayOffset();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: a */
    public final AbstractC9011s mo21560a() throws C8984n1 {
        AbstractC9011s c9000q;
        m21576c(2);
        int iM21615x = m21615x();
        if (iM21615x == 0) {
            return AbstractC9011s.f21106b;
        }
        m21564a(iM21615x);
        if (this.f21020a) {
            byte[] bArr = this.f21021b;
            int i = this.f21022c;
            C9000q c9000q2 = AbstractC9011s.f21106b;
            c9000q = new C8982n(bArr, i, iM21615x);
        } else {
            byte[] bArr2 = this.f21021b;
            int i2 = this.f21022c;
            C9000q c9000q3 = AbstractC9011s.f21106b;
            AbstractC9011s.m21712a(i2, i2 + iM21615x, bArr2.length);
            c9000q = new C9000q(AbstractC9011s.f21107c.mo21667a(bArr2, i2, iM21615x));
        }
        this.f21022c += iM21615x;
        return c9000q;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: a */
    public final Object mo21561a(InterfaceC9019t2 interfaceC9019t2, C8947h0 c8947h0) throws C8978m1 {
        m21576c(3);
        return m21575c(interfaceC9019t2, c8947h0);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: a */
    public final Object mo21562a(Class cls, C8947h0 c8947h0) throws C8978m1 {
        m21576c(3);
        return m21575c(C8997p2.f21087c.m21698a(cls), c8947h0);
    }

    /* JADX INFO: renamed from: a */
    public final String m21563a(boolean z) throws C8984n1 {
        m21576c(2);
        int iM21615x = m21615x();
        if (iM21615x == 0) {
            return "";
        }
        m21564a(iM21615x);
        if (z) {
            byte[] bArr = this.f21021b;
            int i = this.f21022c;
            if (!AbstractC8927d4.f21001a.m21852b(bArr, i, i + iM21615x)) {
                throw new C8984n1("Protocol message had invalid UTF-8.");
            }
        }
        String str = new String(this.f21021b, this.f21022c, iM21615x, AbstractC8972l1.f21064a);
        this.f21022c += iM21615x;
        return str;
    }

    /* JADX INFO: renamed from: a */
    public final void m21564a(int i) throws C8984n1 {
        if (i < 0 || i > this.f21023d - this.f21022c) {
            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: a */
    public final void mo21565a(List list) throws C8984n1 {
        int i;
        int i2;
        if (!(list instanceof C9023u1)) {
            int i3 = this.f21024e & 7;
            if (i3 == 0) {
                do {
                    m21576c(0);
                    list.add(Long.valueOf(m21616y()));
                    if (m21612u()) {
                        return;
                    } else {
                        i = this.f21022c;
                    }
                } while (m21615x() == this.f21024e);
                this.f21022c = i;
                return;
            }
            if (i3 != 2) {
                int i4 = C8984n1.f21076a;
                throw new C8978m1();
            }
            int iM21615x = this.f21022c + m21615x();
            while (this.f21022c < iM21615x) {
                list.add(Long.valueOf(m21616y()));
            }
            m21571b(iM21615x);
            return;
        }
        C9023u1 c9023u1 = (C9023u1) list;
        int i5 = this.f21024e & 7;
        if (i5 == 0) {
            do {
                m21576c(0);
                c9023u1.m21775a(m21616y());
                if (m21612u()) {
                    return;
                } else {
                    i2 = this.f21022c;
                }
            } while (m21615x() == this.f21024e);
            this.f21022c = i2;
            return;
        }
        if (i5 != 2) {
            int i6 = C8984n1.f21076a;
            throw new C8978m1();
        }
        int iM21615x2 = this.f21022c + m21615x();
        while (this.f21022c < iM21615x2) {
            c9023u1.m21775a(m21616y());
        }
        m21571b(iM21615x2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: a */
    public final void mo21566a(List list, InterfaceC9019t2 interfaceC9019t2, C8947h0 c8947h0) throws C8978m1 {
        int i;
        int i2 = this.f21024e;
        if ((i2 & 7) != 3) {
            int i3 = C8984n1.f21076a;
            throw new C8978m1();
        }
        do {
            list.add(m21575c(interfaceC9019t2, c8947h0));
            if (m21612u()) {
                return;
            } else {
                i = this.f21022c;
            }
        } while (m21615x() == i2);
        this.f21022c = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m21567a(List list, boolean z) throws C8978m1 {
        int i;
        int i2;
        if ((this.f21024e & 7) != 2) {
            int i3 = C8984n1.f21076a;
            throw new C8978m1();
        }
        if (!(list instanceof InterfaceC9002q1) || z) {
            do {
                list.add(m21563a(z));
                if (m21612u()) {
                    return;
                } else {
                    i = this.f21022c;
                }
            } while (m21615x() == this.f21024e);
            this.f21022c = i;
            return;
        }
        InterfaceC9002q1 interfaceC9002q1 = (InterfaceC9002q1) list;
        do {
            interfaceC9002q1.mo21696a(mo21560a());
            if (m21612u()) {
                return;
            } else {
                i2 = this.f21022c;
            }
        } while (m21615x() == this.f21024e);
        this.f21022c = i2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: b */
    public final int mo21568b() throws C8978m1 {
        m21576c(0);
        return m21615x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: b */
    public final Object mo21569b(InterfaceC9019t2 interfaceC9019t2, C8947h0 c8947h0) throws C8978m1 {
        m21576c(2);
        return m21579d(interfaceC9019t2, c8947h0);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: b */
    public final Object mo21570b(Class cls, C8947h0 c8947h0) throws C8978m1 {
        m21576c(2);
        return m21579d(C8997p2.f21087c.m21698a(cls), c8947h0);
    }

    /* JADX INFO: renamed from: b */
    public final void m21571b(int i) throws C8984n1 {
        if (this.f21022c != i) {
            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: b */
    public final void mo21572b(List list) throws C8978m1 {
        m21567a(list, true);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: b */
    public final void mo21573b(List list, InterfaceC9019t2 interfaceC9019t2, C8947h0 c8947h0) throws C8978m1 {
        int i;
        int i2 = this.f21024e;
        if ((i2 & 7) != 2) {
            int i3 = C8984n1.f21076a;
            throw new C8978m1();
        }
        do {
            list.add(m21579d(interfaceC9019t2, c8947h0));
            if (m21612u()) {
                return;
            } else {
                i = this.f21022c;
            }
        } while (m21615x() == i2);
        this.f21022c = i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: c */
    public final int mo21574c() throws C8978m1 {
        m21576c(0);
        return m21615x();
    }

    /* JADX INFO: renamed from: c */
    public final Object m21575c(InterfaceC9019t2 interfaceC9019t2, C8947h0 c8947h0) {
        int i = this.f21025f;
        this.f21025f = ((this.f21024e >>> 3) << 3) | 4;
        try {
            Object objMo21629a = interfaceC9019t2.mo21629a();
            interfaceC9019t2.mo21636a(objMo21629a, this, c8947h0);
            interfaceC9019t2.mo21652c(objMo21629a);
            if (this.f21024e != this.f21025f) {
                throw new C8984n1("Failed to parse the message.");
            }
            this.f21025f = i;
            return objMo21629a;
        } catch (Throwable th) {
            this.f21025f = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m21576c(int i) throws C8978m1 {
        if ((this.f21024e & 7) == i) {
            return;
        }
        int i2 = C8984n1.f21076a;
        throw new C8978m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: c */
    public final void mo21577c(List list) throws C8984n1 {
        int i;
        int i2;
        if (!(list instanceof C8906a1)) {
            int i3 = this.f21024e & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    int i4 = C8984n1.f21076a;
                    throw new C8978m1();
                }
                int iM21615x = this.f21022c + m21615x();
                while (this.f21022c < iM21615x) {
                    list.add(Integer.valueOf(AbstractC9031w.m21818b(m21615x())));
                }
                return;
            }
            do {
                m21576c(0);
                list.add(Integer.valueOf(AbstractC9031w.m21818b(m21615x())));
                if (m21612u()) {
                    return;
                } else {
                    i = this.f21022c;
                }
            } while (m21615x() == this.f21024e);
            this.f21022c = i;
            return;
        }
        C8906a1 c8906a1 = (C8906a1) list;
        int i5 = this.f21024e & 7;
        if (i5 != 0) {
            if (i5 != 2) {
                int i6 = C8984n1.f21076a;
                throw new C8978m1();
            }
            int iM21615x2 = this.f21022c + m21615x();
            while (this.f21022c < iM21615x2) {
                c8906a1.m21503c(AbstractC9031w.m21818b(m21615x()));
            }
            return;
        }
        do {
            m21576c(0);
            c8906a1.m21503c(AbstractC9031w.m21818b(m21615x()));
            if (m21612u()) {
                return;
            } else {
                i2 = this.f21022c;
            }
        } while (m21615x() == this.f21024e);
        this.f21022c = i2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: d */
    public final int mo21578d() throws C8978m1 {
        m21576c(0);
        return m21615x();
    }

    /* JADX INFO: renamed from: d */
    public final Object m21579d(InterfaceC9019t2 interfaceC9019t2, C8947h0 c8947h0) throws C8984n1 {
        int iM21615x = m21615x();
        m21564a(iM21615x);
        int i = this.f21023d;
        int i2 = this.f21022c + iM21615x;
        this.f21023d = i2;
        try {
            Object objMo21629a = interfaceC9019t2.mo21629a();
            interfaceC9019t2.mo21636a(objMo21629a, this, c8947h0);
            interfaceC9019t2.mo21652c(objMo21629a);
            if (this.f21022c != i2) {
                throw new C8984n1("Failed to parse the message.");
            }
            this.f21023d = i;
            return objMo21629a;
        } catch (Throwable th) {
            this.f21023d = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m21580d(int i) throws C8984n1 {
        m21564a(i);
        if ((i & 3) != 0) {
            throw new C8984n1("Failed to parse the message.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: d */
    public final void mo21581d(List list) throws C8984n1 {
        int i;
        int i2;
        if (!(list instanceof C9001q0)) {
            int i3 = this.f21024e & 7;
            if (i3 == 2) {
                int iM21615x = m21615x();
                m21580d(iM21615x);
                int i4 = this.f21022c + iM21615x;
                while (this.f21022c < i4) {
                    list.add(Float.valueOf(Float.intBitsToFloat(m21613v())));
                }
                return;
            }
            if (i3 != 5) {
                int i5 = C8984n1.f21076a;
                throw new C8978m1();
            }
            do {
                list.add(Float.valueOf(mo21595k()));
                if (m21612u()) {
                    return;
                } else {
                    i = this.f21022c;
                }
            } while (m21615x() == this.f21024e);
            this.f21022c = i;
            return;
        }
        C9001q0 c9001q0 = (C9001q0) list;
        int i6 = this.f21024e & 7;
        if (i6 == 2) {
            int iM21615x2 = m21615x();
            m21580d(iM21615x2);
            int i7 = this.f21022c + iM21615x2;
            while (this.f21022c < i7) {
                c9001q0.m21706a(Float.intBitsToFloat(m21613v()));
            }
            return;
        }
        if (i6 != 5) {
            int i8 = C8984n1.f21076a;
            throw new C8978m1();
        }
        do {
            c9001q0.m21706a(mo21595k());
            if (m21612u()) {
                return;
            } else {
                i2 = this.f21022c;
            }
        } while (m21615x() == this.f21024e);
        this.f21022c = i2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: e */
    public final int mo21582e() {
        return this.f21024e;
    }

    /* JADX INFO: renamed from: e */
    public final void m21583e(int i) throws C8984n1 {
        m21564a(i);
        if ((i & 7) != 0) {
            throw new C8984n1("Failed to parse the message.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: e */
    public final void mo21584e(List list) throws C8984n1 {
        int i;
        int i2;
        if (!(list instanceof C8906a1)) {
            int i3 = this.f21024e & 7;
            if (i3 == 2) {
                int iM21615x = m21615x();
                m21580d(iM21615x);
                int i4 = this.f21022c + iM21615x;
                while (this.f21022c < i4) {
                    list.add(Integer.valueOf(m21613v()));
                }
                return;
            }
            if (i3 != 5) {
                int i5 = C8984n1.f21076a;
                throw new C8978m1();
            }
            do {
                list.add(Integer.valueOf(mo21607q()));
                if (m21612u()) {
                    return;
                } else {
                    i = this.f21022c;
                }
            } while (m21615x() == this.f21024e);
            this.f21022c = i;
            return;
        }
        C8906a1 c8906a1 = (C8906a1) list;
        int i6 = this.f21024e & 7;
        if (i6 == 2) {
            int iM21615x2 = m21615x();
            m21580d(iM21615x2);
            int i7 = this.f21022c + iM21615x2;
            while (this.f21022c < i7) {
                c8906a1.m21503c(m21613v());
            }
            return;
        }
        if (i6 != 5) {
            int i8 = C8984n1.f21076a;
            throw new C8978m1();
        }
        do {
            c8906a1.m21503c(mo21607q());
            if (m21612u()) {
                return;
            } else {
                i2 = this.f21022c;
            }
        } while (m21615x() == this.f21024e);
        this.f21022c = i2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: f */
    public final long mo21585f() throws C8978m1 {
        m21576c(0);
        return m21616y();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: f */
    public final void mo21586f(List list) throws C8984n1 {
        int i;
        int i2;
        if (!(list instanceof C8906a1)) {
            int i3 = this.f21024e & 7;
            if (i3 == 2) {
                int iM21615x = m21615x();
                m21580d(iM21615x);
                int i4 = this.f21022c + iM21615x;
                while (this.f21022c < i4) {
                    list.add(Integer.valueOf(m21613v()));
                }
                return;
            }
            if (i3 != 5) {
                int i5 = C8984n1.f21076a;
                throw new C8978m1();
            }
            do {
                list.add(Integer.valueOf(mo21599m()));
                if (m21612u()) {
                    return;
                } else {
                    i = this.f21022c;
                }
            } while (m21615x() == this.f21024e);
            this.f21022c = i;
            return;
        }
        C8906a1 c8906a1 = (C8906a1) list;
        int i6 = this.f21024e & 7;
        if (i6 == 2) {
            int iM21615x2 = m21615x();
            m21580d(iM21615x2);
            int i7 = this.f21022c + iM21615x2;
            while (this.f21022c < i7) {
                c8906a1.m21503c(m21613v());
            }
            return;
        }
        if (i6 != 5) {
            int i8 = C8984n1.f21076a;
            throw new C8978m1();
        }
        do {
            c8906a1.m21503c(mo21599m());
            if (m21612u()) {
                return;
            } else {
                i2 = this.f21022c;
            }
        } while (m21615x() == this.f21024e);
        this.f21022c = i2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: g */
    public final long mo21587g() throws C8984n1 {
        m21576c(1);
        m21564a(8);
        return m21614w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: g */
    public final void mo21588g(List list) throws C8984n1 {
        int i;
        int i2;
        if (!(list instanceof C9023u1)) {
            int i3 = this.f21024e & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    int i4 = C8984n1.f21076a;
                    throw new C8978m1();
                }
                int iM21615x = this.f21022c + m21615x();
                while (this.f21022c < iM21615x) {
                    list.add(Long.valueOf(AbstractC9031w.m21817a(m21616y())));
                }
                return;
            }
            do {
                m21576c(0);
                list.add(Long.valueOf(AbstractC9031w.m21817a(m21616y())));
                if (m21612u()) {
                    return;
                } else {
                    i = this.f21022c;
                }
            } while (m21615x() == this.f21024e);
            this.f21022c = i;
            return;
        }
        C9023u1 c9023u1 = (C9023u1) list;
        int i5 = this.f21024e & 7;
        if (i5 != 0) {
            if (i5 != 2) {
                int i6 = C8984n1.f21076a;
                throw new C8978m1();
            }
            int iM21615x2 = this.f21022c + m21615x();
            while (this.f21022c < iM21615x2) {
                c9023u1.m21775a(AbstractC9031w.m21817a(m21616y()));
            }
            return;
        }
        do {
            m21576c(0);
            c9023u1.m21775a(AbstractC9031w.m21817a(m21616y()));
            if (m21612u()) {
                return;
            } else {
                i2 = this.f21022c;
            }
        } while (m21615x() == this.f21024e);
        this.f21022c = i2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: h */
    public final double mo21589h() throws C8984n1 {
        m21576c(1);
        m21564a(8);
        return Double.longBitsToDouble(m21614w());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: h */
    public final void mo21590h(List list) throws C8978m1 {
        int i;
        if ((this.f21024e & 7) != 2) {
            int i2 = C8984n1.f21076a;
            throw new C8978m1();
        }
        do {
            list.add(mo21560a());
            if (m21612u()) {
                return;
            } else {
                i = this.f21022c;
            }
        } while (m21615x() == this.f21024e);
        this.f21022c = i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: i */
    public final void mo21591i(List list) throws C8984n1 {
        int i;
        int i2;
        if (!(list instanceof C8906a1)) {
            int i3 = this.f21024e & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    int i4 = C8984n1.f21076a;
                    throw new C8978m1();
                }
                int iM21615x = this.f21022c + m21615x();
                while (this.f21022c < iM21615x) {
                    list.add(Integer.valueOf(m21615x()));
                }
                return;
            }
            do {
                m21576c(0);
                list.add(Integer.valueOf(m21615x()));
                if (m21612u()) {
                    return;
                } else {
                    i = this.f21022c;
                }
            } while (m21615x() == this.f21024e);
            this.f21022c = i;
            return;
        }
        C8906a1 c8906a1 = (C8906a1) list;
        int i5 = this.f21024e & 7;
        if (i5 != 0) {
            if (i5 != 2) {
                int i6 = C8984n1.f21076a;
                throw new C8978m1();
            }
            int iM21615x2 = this.f21022c + m21615x();
            while (this.f21022c < iM21615x2) {
                c8906a1.m21503c(m21615x());
            }
            return;
        }
        do {
            m21576c(0);
            c8906a1.m21503c(m21615x());
            if (m21612u()) {
                return;
            } else {
                i2 = this.f21022c;
            }
        } while (m21615x() == this.f21024e);
        this.f21022c = i2;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0091  */
    /* JADX WARN: Code duplicated, block: B:49:0x009c A[LOOP:2: B:43:0x0089->B:49:0x009c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x009b A[SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: i */
    public final boolean mo21592i() throws C8984n1 {
        int i;
        int i2;
        int i3;
        byte[] bArr;
        if (m21612u() || (i = this.f21024e) == (i2 = this.f21025f)) {
            return false;
        }
        int i4 = i & 7;
        if (i4 != 0) {
            if (i4 == 1) {
                m21564a(8);
                this.f21022c += 8;
                return true;
            }
            if (i4 == 2) {
                int iM21615x = m21615x();
                m21564a(iM21615x);
                this.f21022c += iM21615x;
                return true;
            }
            if (i4 != 3) {
                if (i4 != 5) {
                    int i5 = C8984n1.f21076a;
                    throw new C8978m1();
                }
                m21564a(4);
                this.f21022c += 4;
                return true;
            }
            this.f21025f = ((i >>> 3) << 3) | 4;
            while (mo21610s() != Integer.MAX_VALUE && mo21592i()) {
            }
            if (this.f21024e != this.f21025f) {
                throw new C8984n1("Failed to parse the message.");
            }
            this.f21025f = i2;
            return true;
        }
        int i6 = this.f21023d;
        int i7 = this.f21022c;
        if (i6 - i7 < 10) {
            for (int i8 = 0; i8 < 10; i8++) {
                i3 = this.f21022c;
                if (i3 != this.f21023d) {
                    throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                bArr = this.f21021b;
                this.f21022c = i3 + 1;
                if (bArr[i3] >= 0) {
                }
            }
            throw new C8984n1("CodedInputStream encountered a malformed varint.");
        }
        byte[] bArr2 = this.f21021b;
        int i9 = 0;
        while (i9 < 10) {
            int i10 = i7 + 1;
            if (bArr2[i7] >= 0) {
                this.f21022c = i10;
            } else {
                i9++;
                i7 = i10;
            }
        }
        while (i8 < 10) {
            i3 = this.f21022c;
            if (i3 != this.f21023d) {
                throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            bArr = this.f21021b;
            this.f21022c = i3 + 1;
            if (bArr[i3] >= 0) {
            }
        }
        throw new C8984n1("CodedInputStream encountered a malformed varint.");
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: j */
    public final int mo21593j() throws C8978m1 {
        m21576c(0);
        return AbstractC9031w.m21818b(m21615x());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: j */
    public final void mo21594j(List list) throws C8984n1 {
        int i;
        int i2;
        if (!(list instanceof C8923d0)) {
            int i3 = this.f21024e & 7;
            if (i3 == 1) {
                do {
                    list.add(Double.valueOf(mo21589h()));
                    if (m21612u()) {
                        return;
                    } else {
                        i = this.f21022c;
                    }
                } while (m21615x() == this.f21024e);
                this.f21022c = i;
                return;
            }
            if (i3 != 2) {
                int i4 = C8984n1.f21076a;
                throw new C8978m1();
            }
            int iM21615x = m21615x();
            m21583e(iM21615x);
            int i5 = this.f21022c + iM21615x;
            while (this.f21022c < i5) {
                list.add(Double.valueOf(Double.longBitsToDouble(m21614w())));
            }
            return;
        }
        C8923d0 c8923d0 = (C8923d0) list;
        int i6 = this.f21024e & 7;
        if (i6 == 1) {
            do {
                c8923d0.m21529a(mo21589h());
                if (m21612u()) {
                    return;
                } else {
                    i2 = this.f21022c;
                }
            } while (m21615x() == this.f21024e);
            this.f21022c = i2;
            return;
        }
        if (i6 != 2) {
            int i7 = C8984n1.f21076a;
            throw new C8978m1();
        }
        int iM21615x2 = m21615x();
        m21583e(iM21615x2);
        int i8 = this.f21022c + iM21615x2;
        while (this.f21022c < i8) {
            c8923d0.m21529a(Double.longBitsToDouble(m21614w()));
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: k */
    public final float mo21595k() throws C8984n1 {
        m21576c(5);
        m21564a(4);
        return Float.intBitsToFloat(m21613v());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: k */
    public final void mo21596k(List list) throws C8984n1 {
        int i;
        int i2;
        if (!(list instanceof C9023u1)) {
            int i3 = this.f21024e & 7;
            if (i3 == 0) {
                do {
                    m21576c(0);
                    list.add(Long.valueOf(m21616y()));
                    if (m21612u()) {
                        return;
                    } else {
                        i = this.f21022c;
                    }
                } while (m21615x() == this.f21024e);
                this.f21022c = i;
                return;
            }
            if (i3 != 2) {
                int i4 = C8984n1.f21076a;
                throw new C8978m1();
            }
            int iM21615x = this.f21022c + m21615x();
            while (this.f21022c < iM21615x) {
                list.add(Long.valueOf(m21616y()));
            }
            m21571b(iM21615x);
            return;
        }
        C9023u1 c9023u1 = (C9023u1) list;
        int i5 = this.f21024e & 7;
        if (i5 == 0) {
            do {
                m21576c(0);
                c9023u1.m21775a(m21616y());
                if (m21612u()) {
                    return;
                } else {
                    i2 = this.f21022c;
                }
            } while (m21615x() == this.f21024e);
            this.f21022c = i2;
            return;
        }
        if (i5 != 2) {
            int i6 = C8984n1.f21076a;
            throw new C8978m1();
        }
        int iM21615x2 = this.f21022c + m21615x();
        while (this.f21022c < iM21615x2) {
            c9023u1.m21775a(m21616y());
        }
        m21571b(iM21615x2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: l */
    public final long mo21597l() throws C8978m1 {
        m21576c(0);
        return AbstractC9031w.m21817a(m21616y());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: l */
    public final void mo21598l(List list) throws C8984n1 {
        int i;
        int i2;
        if (!(list instanceof C8958j)) {
            int i3 = this.f21024e & 7;
            if (i3 == 0) {
                do {
                    list.add(Boolean.valueOf(mo21609r()));
                    if (m21612u()) {
                        return;
                    } else {
                        i = this.f21022c;
                    }
                } while (m21615x() == this.f21024e);
                this.f21022c = i;
                return;
            }
            if (i3 != 2) {
                int i4 = C8984n1.f21076a;
                throw new C8978m1();
            }
            int iM21615x = this.f21022c + m21615x();
            while (this.f21022c < iM21615x) {
                list.add(Boolean.valueOf(m21615x() != 0));
            }
            m21571b(iM21615x);
            return;
        }
        C8958j c8958j = (C8958j) list;
        int i5 = this.f21024e & 7;
        if (i5 == 0) {
            do {
                c8958j.m21656a(mo21609r());
                if (m21612u()) {
                    return;
                } else {
                    i2 = this.f21022c;
                }
            } while (m21615x() == this.f21024e);
            this.f21022c = i2;
            return;
        }
        if (i5 != 2) {
            int i6 = C8984n1.f21076a;
            throw new C8978m1();
        }
        int iM21615x2 = this.f21022c + m21615x();
        while (this.f21022c < iM21615x2) {
            c8958j.m21656a(m21615x() != 0);
        }
        m21571b(iM21615x2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: m */
    public final int mo21599m() throws C8984n1 {
        m21576c(5);
        m21564a(4);
        return m21613v();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: m */
    public final void mo21600m(List list) throws C8984n1 {
        int i;
        int i2;
        if (!(list instanceof C9023u1)) {
            int i3 = this.f21024e & 7;
            if (i3 == 1) {
                do {
                    list.add(Long.valueOf(mo21611t()));
                    if (m21612u()) {
                        return;
                    } else {
                        i = this.f21022c;
                    }
                } while (m21615x() == this.f21024e);
                this.f21022c = i;
                return;
            }
            if (i3 != 2) {
                int i4 = C8984n1.f21076a;
                throw new C8978m1();
            }
            int iM21615x = m21615x();
            m21583e(iM21615x);
            int i5 = this.f21022c + iM21615x;
            while (this.f21022c < i5) {
                list.add(Long.valueOf(m21614w()));
            }
            return;
        }
        C9023u1 c9023u1 = (C9023u1) list;
        int i6 = this.f21024e & 7;
        if (i6 == 1) {
            do {
                c9023u1.m21775a(mo21611t());
                if (m21612u()) {
                    return;
                } else {
                    i2 = this.f21022c;
                }
            } while (m21615x() == this.f21024e);
            this.f21022c = i2;
            return;
        }
        if (i6 != 2) {
            int i7 = C8984n1.f21076a;
            throw new C8978m1();
        }
        int iM21615x2 = m21615x();
        m21583e(iM21615x2);
        int i8 = this.f21022c + iM21615x2;
        while (this.f21022c < i8) {
            c9023u1.m21775a(m21614w());
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: n */
    public final String mo21601n() {
        return m21563a(false);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: n */
    public final void mo21602n(List list) throws C8984n1 {
        int i;
        int i2;
        if (!(list instanceof C9023u1)) {
            int i3 = this.f21024e & 7;
            if (i3 == 1) {
                do {
                    list.add(Long.valueOf(mo21587g()));
                    if (m21612u()) {
                        return;
                    } else {
                        i = this.f21022c;
                    }
                } while (m21615x() == this.f21024e);
                this.f21022c = i;
                return;
            }
            if (i3 != 2) {
                int i4 = C8984n1.f21076a;
                throw new C8978m1();
            }
            int iM21615x = m21615x();
            m21583e(iM21615x);
            int i5 = this.f21022c + iM21615x;
            while (this.f21022c < i5) {
                list.add(Long.valueOf(m21614w()));
            }
            return;
        }
        C9023u1 c9023u1 = (C9023u1) list;
        int i6 = this.f21024e & 7;
        if (i6 == 1) {
            do {
                c9023u1.m21775a(mo21587g());
                if (m21612u()) {
                    return;
                } else {
                    i2 = this.f21022c;
                }
            } while (m21615x() == this.f21024e);
            this.f21022c = i2;
            return;
        }
        if (i6 != 2) {
            int i7 = C8984n1.f21076a;
            throw new C8978m1();
        }
        int iM21615x2 = m21615x();
        m21583e(iM21615x2);
        int i8 = this.f21022c + iM21615x2;
        while (this.f21022c < i8) {
            c9023u1.m21775a(m21614w());
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: o */
    public final long mo21603o() throws C8978m1 {
        m21576c(0);
        return m21616y();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: o */
    public final void mo21604o(List list) throws C8984n1 {
        int i;
        int i2;
        if (!(list instanceof C8906a1)) {
            int i3 = this.f21024e & 7;
            if (i3 == 0) {
                do {
                    m21576c(0);
                    list.add(Integer.valueOf(m21615x()));
                    if (m21612u()) {
                        return;
                    } else {
                        i = this.f21022c;
                    }
                } while (m21615x() == this.f21024e);
                this.f21022c = i;
                return;
            }
            if (i3 != 2) {
                int i4 = C8984n1.f21076a;
                throw new C8978m1();
            }
            int iM21615x = this.f21022c + m21615x();
            while (this.f21022c < iM21615x) {
                list.add(Integer.valueOf(m21615x()));
            }
            m21571b(iM21615x);
            return;
        }
        C8906a1 c8906a1 = (C8906a1) list;
        int i5 = this.f21024e & 7;
        if (i5 == 0) {
            do {
                m21576c(0);
                c8906a1.m21503c(m21615x());
                if (m21612u()) {
                    return;
                } else {
                    i2 = this.f21022c;
                }
            } while (m21615x() == this.f21024e);
            this.f21022c = i2;
            return;
        }
        if (i5 != 2) {
            int i6 = C8984n1.f21076a;
            throw new C8978m1();
        }
        int iM21615x2 = this.f21022c + m21615x();
        while (this.f21022c < iM21615x2) {
            c8906a1.m21503c(m21615x());
        }
        m21571b(iM21615x2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: p */
    public final String mo21605p() {
        return m21563a(true);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: p */
    public final void mo21606p(List list) throws C8984n1 {
        int i;
        int i2;
        if (!(list instanceof C8906a1)) {
            int i3 = this.f21024e & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    int i4 = C8984n1.f21076a;
                    throw new C8978m1();
                }
                int iM21615x = this.f21022c + m21615x();
                while (this.f21022c < iM21615x) {
                    list.add(Integer.valueOf(m21615x()));
                }
                return;
            }
            do {
                m21576c(0);
                list.add(Integer.valueOf(m21615x()));
                if (m21612u()) {
                    return;
                } else {
                    i = this.f21022c;
                }
            } while (m21615x() == this.f21024e);
            this.f21022c = i;
            return;
        }
        C8906a1 c8906a1 = (C8906a1) list;
        int i5 = this.f21024e & 7;
        if (i5 != 0) {
            if (i5 != 2) {
                int i6 = C8984n1.f21076a;
                throw new C8978m1();
            }
            int iM21615x2 = this.f21022c + m21615x();
            while (this.f21022c < iM21615x2) {
                c8906a1.m21503c(m21615x());
            }
            return;
        }
        do {
            m21576c(0);
            c8906a1.m21503c(m21615x());
            if (m21612u()) {
                return;
            } else {
                i2 = this.f21022c;
            }
        } while (m21615x() == this.f21024e);
        this.f21022c = i2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: q */
    public final int mo21607q() throws C8984n1 {
        m21576c(5);
        m21564a(4);
        return m21613v();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: q */
    public final void mo21608q(List list) throws C8978m1 {
        m21567a(list, false);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: r */
    public final boolean mo21609r() throws C8978m1 {
        m21576c(0);
        return m21615x() != 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: s */
    public final int mo21610s() throws C8984n1 {
        if (m21612u()) {
            return Integer.MAX_VALUE;
        }
        int iM21615x = m21615x();
        this.f21024e = iM21615x;
        if (iM21615x == this.f21025f) {
            return Integer.MAX_VALUE;
        }
        return iM21615x >>> 3;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: t */
    public final long mo21611t() throws C8984n1 {
        m21576c(1);
        m21564a(8);
        return m21614w();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m21612u() {
        return this.f21022c == this.f21023d;
    }

    /* JADX INFO: renamed from: v */
    public final int m21613v() {
        int i = this.f21022c;
        byte[] bArr = this.f21021b;
        this.f21022c = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: w */
    public final long m21614w() {
        int i = this.f21022c;
        byte[] bArr = this.f21021b;
        this.f21022c = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a4 A[PHI: r2
  0x00a4: PHI (r2v7 int) = (r2v6 int), (r2v9 int) binds: [B:37:0x0082, B:41:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: x */
    public final int m21615x() throws C8984n1 {
        int i;
        int i2 = this.f21022c;
        int i3 = this.f21023d;
        if (i3 == i2) {
            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f21021b;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            this.f21022c = i4;
            return b;
        }
        if (i3 - i4 < 9) {
            long j = 0;
            for (int i5 = 0; i5 < 64; i5 += 7) {
                int i6 = this.f21022c;
                if (i6 == this.f21023d) {
                    throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                byte[] bArr2 = this.f21021b;
                this.f21022c = i6 + 1;
                byte b2 = bArr2[i6];
                j |= ((long) (b2 & 127)) << i5;
                if ((b2 & 128) == 0) {
                    return (int) j;
                }
            }
            throw new C8984n1("CodedInputStream encountered a malformed varint.");
        }
        int i7 = i2 + 2;
        int i8 = (bArr[i4] << 7) ^ b;
        if (i8 < 0) {
            i = i8 ^ (-128);
        } else {
            int i9 = i2 + 3;
            int i10 = (bArr[i7] << Ascii.f22500SO) ^ i8;
            if (i10 >= 0) {
                i = i10 ^ 16256;
            } else {
                int i11 = i2 + 4;
                int i12 = i10 ^ (bArr[i9] << Ascii.NAK);
                if (i12 < 0) {
                    i = (-2080896) ^ i12;
                    i7 = i11;
                } else {
                    i9 = i2 + 5;
                    byte b3 = bArr[i11];
                    int i13 = (i12 ^ (b3 << Ascii.f22493FS)) ^ 266354560;
                    if (b3 < 0) {
                        int i14 = i2 + 6;
                        if (bArr[i9] < 0) {
                            i9 = i2 + 7;
                            if (bArr[i14] < 0) {
                                i14 = i2 + 8;
                                if (bArr[i9] < 0) {
                                    i9 = i2 + 9;
                                    if (bArr[i14] < 0) {
                                        int i15 = i2 + 10;
                                        if (bArr[i9] < 0) {
                                            throw new C8984n1("CodedInputStream encountered a malformed varint.");
                                        }
                                        i9 = i15;
                                    }
                                } else {
                                    i9 = i14;
                                }
                            }
                        } else {
                            i9 = i14;
                        }
                    }
                    i = i13;
                }
            }
            i7 = i9;
        }
        this.f21022c = i7;
        return i;
    }

    /* JADX INFO: renamed from: y */
    public final long m21616y() throws C8984n1 {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f21022c;
        int i2 = this.f21023d;
        if (i2 == i) {
            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f21021b;
        int i3 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            this.f21022c = i3;
            return b;
        }
        long j5 = 0;
        if (i2 - i3 < 9) {
            for (int i4 = 0; i4 < 64; i4 += 7) {
                int i5 = this.f21022c;
                if (i5 == this.f21023d) {
                    throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                byte[] bArr2 = this.f21021b;
                this.f21022c = i5 + 1;
                byte b2 = bArr2[i5];
                j5 |= ((long) (b2 & 127)) << i4;
                if ((b2 & 128) == 0) {
                    return j5;
                }
            }
            throw new C8984n1("CodedInputStream encountered a malformed varint.");
        }
        int i6 = i + 2;
        int i7 = (bArr[i3] << 7) ^ b;
        if (i7 < 0) {
            j = i7 ^ (-128);
        } else {
            int i8 = i + 3;
            int i9 = (bArr[i6] << Ascii.f22500SO) ^ i7;
            if (i9 >= 0) {
                j = i9 ^ 16256;
                i6 = i8;
            } else {
                int i10 = i + 4;
                int i11 = i9 ^ (bArr[i8] << Ascii.NAK);
                if (i11 < 0) {
                    j4 = (-2080896) ^ i11;
                } else {
                    long j6 = i11;
                    i6 = i + 5;
                    long j7 = j6 ^ (((long) bArr[i10]) << 28);
                    if (j7 >= 0) {
                        j3 = 266354560;
                    } else {
                        i10 = i + 6;
                        long j8 = j7 ^ (((long) bArr[i6]) << 35);
                        if (j8 < 0) {
                            j2 = -34093383808L;
                        } else {
                            i6 = i + 7;
                            j7 = j8 ^ (((long) bArr[i10]) << 42);
                            if (j7 >= 0) {
                                j3 = 4363953127296L;
                            } else {
                                i10 = i + 8;
                                j8 = j7 ^ (((long) bArr[i6]) << 49);
                                if (j8 < 0) {
                                    j2 = -558586000294016L;
                                } else {
                                    i6 = i + 9;
                                    long j9 = (j8 ^ (((long) bArr[i10]) << 56)) ^ 71499008037633920L;
                                    if (j9 < 0) {
                                        int i12 = i + 10;
                                        if (bArr[i6] < 0) {
                                            throw new C8984n1("CodedInputStream encountered a malformed varint.");
                                        }
                                        i6 = i12;
                                    }
                                    j = j9;
                                }
                            }
                        }
                        j4 = j2 ^ j8;
                    }
                    j = j3 ^ j7;
                }
                i6 = i10;
                j = j4;
            }
        }
        this.f21022c = i6;
        return j;
    }
}
