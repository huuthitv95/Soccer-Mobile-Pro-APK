package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.x */
/* JADX INFO: loaded from: classes4.dex */
public final class C9036x implements InterfaceC9014s2 {

    /* JADX INFO: renamed from: a */
    public final AbstractC9031w f21159a;

    /* JADX INFO: renamed from: b */
    public int f21160b;

    /* JADX INFO: renamed from: c */
    public int f21161c;

    /* JADX INFO: renamed from: d */
    public int f21162d = 0;

    public C9036x(AbstractC9031w abstractC9031w) {
        Charset charset = AbstractC8972l1.f21064a;
        if (abstractC9031w == null) {
            throw new NullPointerException("input");
        }
        this.f21159a = abstractC9031w;
        abstractC9031w.f21148d = this;
    }

    /* JADX INFO: renamed from: c */
    public static void m21819c(int i) throws C8984n1 {
        if ((i & 3) != 0) {
            throw new C8984n1("Failed to parse the message.");
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m21820d(int i) throws C8984n1 {
        if ((i & 7) != 0) {
            throw new C8984n1("Failed to parse the message.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: a */
    public final AbstractC9011s mo21560a() throws C8978m1 {
        m21823b(2);
        return this.f21159a.mo21724e();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: a */
    public final Object mo21561a(InterfaceC9019t2 interfaceC9019t2, C8947h0 c8947h0) throws C8978m1 {
        m21823b(3);
        return m21824c(interfaceC9019t2, c8947h0);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: a */
    public final Object mo21562a(Class cls, C8947h0 c8947h0) throws C8978m1 {
        m21823b(3);
        return m21824c(C8997p2.f21087c.m21698a(cls), c8947h0);
    }

    /* JADX INFO: renamed from: a */
    public final void m21821a(int i) throws C8984n1 {
        if (this.f21159a.mo21719b() != i) {
            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: a */
    public final void mo21565a(List list) throws C8984n1 {
        int iMo21741t;
        int iMo21741t2;
        if (!(list instanceof C9023u1)) {
            int i = this.f21160b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.f21159a.mo21743v()));
                    if (this.f21159a.mo21721c()) {
                        return;
                    } else {
                        iMo21741t = this.f21159a.mo21741t();
                    }
                } while (iMo21741t == this.f21160b);
                this.f21162d = iMo21741t;
                return;
            }
            if (i != 2) {
                int i2 = C8984n1.f21076a;
                throw new C8978m1();
            }
            int iMo21719b = this.f21159a.mo21719b() + this.f21159a.mo21742u();
            do {
                list.add(Long.valueOf(this.f21159a.mo21743v()));
            } while (this.f21159a.mo21719b() < iMo21719b);
            m21821a(iMo21719b);
            return;
        }
        C9023u1 c9023u1 = (C9023u1) list;
        int i3 = this.f21160b & 7;
        if (i3 == 0) {
            do {
                c9023u1.m21775a(this.f21159a.mo21743v());
                if (this.f21159a.mo21721c()) {
                    return;
                } else {
                    iMo21741t2 = this.f21159a.mo21741t();
                }
            } while (iMo21741t2 == this.f21160b);
            this.f21162d = iMo21741t2;
            return;
        }
        if (i3 != 2) {
            int i4 = C8984n1.f21076a;
            throw new C8978m1();
        }
        int iMo21719b2 = this.f21159a.mo21719b() + this.f21159a.mo21742u();
        do {
            c9023u1.m21775a(this.f21159a.mo21743v());
        } while (this.f21159a.mo21719b() < iMo21719b2);
        m21821a(iMo21719b2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: a */
    public final void mo21566a(List list, InterfaceC9019t2 interfaceC9019t2, C8947h0 c8947h0) throws C8978m1 {
        int iMo21741t;
        int i = this.f21160b;
        if ((i & 7) != 3) {
            int i2 = C8984n1.f21076a;
            throw new C8978m1();
        }
        do {
            list.add(m21824c(interfaceC9019t2, c8947h0));
            if (this.f21159a.mo21721c() || this.f21162d != 0) {
                return;
            } else {
                iMo21741t = this.f21159a.mo21741t();
            }
        } while (iMo21741t == i);
        this.f21162d = iMo21741t;
    }

    /* JADX INFO: renamed from: a */
    public final void m21822a(List list, boolean z) throws C8978m1 {
        String strMo21739r;
        int iMo21741t;
        int iMo21741t2;
        if ((this.f21160b & 7) != 2) {
            int i = C8984n1.f21076a;
            throw new C8978m1();
        }
        if ((list instanceof InterfaceC9002q1) && !z) {
            InterfaceC9002q1 interfaceC9002q1 = (InterfaceC9002q1) list;
            do {
                m21823b(2);
                interfaceC9002q1.mo21696a(this.f21159a.mo21724e());
                if (this.f21159a.mo21721c()) {
                    return;
                } else {
                    iMo21741t2 = this.f21159a.mo21741t();
                }
            } while (iMo21741t2 == this.f21160b);
            this.f21162d = iMo21741t2;
            return;
        }
        do {
            if (z) {
                m21823b(2);
                strMo21739r = this.f21159a.mo21740s();
            } else {
                m21823b(2);
                strMo21739r = this.f21159a.mo21739r();
            }
            list.add(strMo21739r);
            if (this.f21159a.mo21721c()) {
                return;
            } else {
                iMo21741t = this.f21159a.mo21741t();
            }
        } while (iMo21741t == this.f21160b);
        this.f21162d = iMo21741t;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: b */
    public final int mo21568b() throws C8978m1 {
        m21823b(0);
        return this.f21159a.mo21728g();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: b */
    public final Object mo21569b(InterfaceC9019t2 interfaceC9019t2, C8947h0 c8947h0) throws C8978m1 {
        m21823b(2);
        return m21825d(interfaceC9019t2, c8947h0);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: b */
    public final Object mo21570b(Class cls, C8947h0 c8947h0) throws C8978m1 {
        m21823b(2);
        return m21825d(C8997p2.f21087c.m21698a(cls), c8947h0);
    }

    /* JADX INFO: renamed from: b */
    public final void m21823b(int i) throws C8978m1 {
        if ((this.f21160b & 7) == i) {
            return;
        }
        int i2 = C8984n1.f21076a;
        throw new C8978m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: b */
    public final void mo21572b(List list) throws C8978m1 {
        m21822a(list, true);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: b */
    public final void mo21573b(List list, InterfaceC9019t2 interfaceC9019t2, C8947h0 c8947h0) throws C8978m1 {
        int iMo21741t;
        int i = this.f21160b;
        if ((i & 7) != 2) {
            int i2 = C8984n1.f21076a;
            throw new C8978m1();
        }
        do {
            list.add(m21825d(interfaceC9019t2, c8947h0));
            if (this.f21159a.mo21721c() || this.f21162d != 0) {
                return;
            } else {
                iMo21741t = this.f21159a.mo21741t();
            }
        } while (iMo21741t == i);
        this.f21162d = iMo21741t;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: c */
    public final int mo21574c() throws C8978m1 {
        m21823b(0);
        return this.f21159a.mo21742u();
    }

    /* JADX INFO: renamed from: c */
    public final Object m21824c(InterfaceC9019t2 interfaceC9019t2, C8947h0 c8947h0) {
        int i = this.f21161c;
        this.f21161c = ((this.f21160b >>> 3) << 3) | 4;
        try {
            Object objMo21629a = interfaceC9019t2.mo21629a();
            interfaceC9019t2.mo21636a(objMo21629a, this, c8947h0);
            interfaceC9019t2.mo21652c(objMo21629a);
            if (this.f21160b != this.f21161c) {
                throw new C8984n1("Failed to parse the message.");
            }
            this.f21161c = i;
            return objMo21629a;
        } catch (Throwable th) {
            this.f21161c = i;
            throw th;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: c */
    public final void mo21577c(List list) throws C8984n1 {
        int iMo21741t;
        int iMo21741t2;
        if (!(list instanceof C8906a1)) {
            int i = this.f21160b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.f21159a.mo21737p()));
                    if (this.f21159a.mo21721c()) {
                        return;
                    } else {
                        iMo21741t = this.f21159a.mo21741t();
                    }
                } while (iMo21741t == this.f21160b);
                this.f21162d = iMo21741t;
                return;
            }
            if (i != 2) {
                int i2 = C8984n1.f21076a;
                throw new C8978m1();
            }
            int iMo21719b = this.f21159a.mo21719b() + this.f21159a.mo21742u();
            do {
                list.add(Integer.valueOf(this.f21159a.mo21737p()));
            } while (this.f21159a.mo21719b() < iMo21719b);
            m21821a(iMo21719b);
            return;
        }
        C8906a1 c8906a1 = (C8906a1) list;
        int i3 = this.f21160b & 7;
        if (i3 == 0) {
            do {
                c8906a1.m21503c(this.f21159a.mo21737p());
                if (this.f21159a.mo21721c()) {
                    return;
                } else {
                    iMo21741t2 = this.f21159a.mo21741t();
                }
            } while (iMo21741t2 == this.f21160b);
            this.f21162d = iMo21741t2;
            return;
        }
        if (i3 != 2) {
            int i4 = C8984n1.f21076a;
            throw new C8978m1();
        }
        int iMo21719b2 = this.f21159a.mo21719b() + this.f21159a.mo21742u();
        do {
            c8906a1.m21503c(this.f21159a.mo21737p());
        } while (this.f21159a.mo21719b() < iMo21719b2);
        m21821a(iMo21719b2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: d */
    public final int mo21578d() throws C8978m1 {
        m21823b(0);
        return this.f21159a.mo21732k();
    }

    /* JADX INFO: renamed from: d */
    public final Object m21825d(InterfaceC9019t2 interfaceC9019t2, C8947h0 c8947h0) throws C8984n1 {
        int iMo21742u = this.f21159a.mo21742u();
        AbstractC9031w abstractC9031w = this.f21159a;
        if (abstractC9031w.f21145a >= abstractC9031w.f21146b) {
            throw new C8984n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iMo21722d = abstractC9031w.mo21722d(iMo21742u);
        Object objMo21629a = interfaceC9019t2.mo21629a();
        this.f21159a.f21145a++;
        interfaceC9019t2.mo21636a(objMo21629a, this, c8947h0);
        interfaceC9019t2.mo21652c(objMo21629a);
        this.f21159a.mo21716a(0);
        AbstractC9031w abstractC9031w2 = this.f21159a;
        abstractC9031w2.f21145a--;
        abstractC9031w2.mo21720c(iMo21722d);
        return objMo21629a;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: d */
    public final void mo21581d(List list) throws C8984n1 {
        int iMo21741t;
        int iMo21741t2;
        if (!(list instanceof C9001q0)) {
            int i = this.f21160b & 7;
            if (i == 2) {
                int iMo21742u = this.f21159a.mo21742u();
                m21819c(iMo21742u);
                int iMo21719b = this.f21159a.mo21719b() + iMo21742u;
                do {
                    list.add(Float.valueOf(this.f21159a.mo21731j()));
                } while (this.f21159a.mo21719b() < iMo21719b);
                return;
            }
            if (i != 5) {
                int i2 = C8984n1.f21076a;
                throw new C8978m1();
            }
            do {
                list.add(Float.valueOf(this.f21159a.mo21731j()));
                if (this.f21159a.mo21721c()) {
                    return;
                } else {
                    iMo21741t = this.f21159a.mo21741t();
                }
            } while (iMo21741t == this.f21160b);
            this.f21162d = iMo21741t;
            return;
        }
        C9001q0 c9001q0 = (C9001q0) list;
        int i3 = this.f21160b & 7;
        if (i3 == 2) {
            int iMo21742u2 = this.f21159a.mo21742u();
            m21819c(iMo21742u2);
            int iMo21719b2 = this.f21159a.mo21719b() + iMo21742u2;
            do {
                c9001q0.m21706a(this.f21159a.mo21731j());
            } while (this.f21159a.mo21719b() < iMo21719b2);
            return;
        }
        if (i3 != 5) {
            int i4 = C8984n1.f21076a;
            throw new C8978m1();
        }
        do {
            c9001q0.m21706a(this.f21159a.mo21731j());
            if (this.f21159a.mo21721c()) {
                return;
            } else {
                iMo21741t2 = this.f21159a.mo21741t();
            }
        } while (iMo21741t2 == this.f21160b);
        this.f21162d = iMo21741t2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: e */
    public final int mo21582e() {
        return this.f21160b;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: e */
    public final void mo21584e(List list) throws C8984n1 {
        int iMo21741t;
        int iMo21741t2;
        if (!(list instanceof C8906a1)) {
            int i = this.f21160b & 7;
            if (i == 2) {
                int iMo21742u = this.f21159a.mo21742u();
                m21819c(iMo21742u);
                int iMo21719b = this.f21159a.mo21719b() + iMo21742u;
                do {
                    list.add(Integer.valueOf(this.f21159a.mo21729h()));
                } while (this.f21159a.mo21719b() < iMo21719b);
                return;
            }
            if (i != 5) {
                int i2 = C8984n1.f21076a;
                throw new C8978m1();
            }
            do {
                list.add(Integer.valueOf(this.f21159a.mo21729h()));
                if (this.f21159a.mo21721c()) {
                    return;
                } else {
                    iMo21741t = this.f21159a.mo21741t();
                }
            } while (iMo21741t == this.f21160b);
            this.f21162d = iMo21741t;
            return;
        }
        C8906a1 c8906a1 = (C8906a1) list;
        int i3 = this.f21160b & 7;
        if (i3 == 2) {
            int iMo21742u2 = this.f21159a.mo21742u();
            m21819c(iMo21742u2);
            int iMo21719b2 = this.f21159a.mo21719b() + iMo21742u2;
            do {
                c8906a1.m21503c(this.f21159a.mo21729h());
            } while (this.f21159a.mo21719b() < iMo21719b2);
            return;
        }
        if (i3 != 5) {
            int i4 = C8984n1.f21076a;
            throw new C8978m1();
        }
        do {
            c8906a1.m21503c(this.f21159a.mo21729h());
            if (this.f21159a.mo21721c()) {
                return;
            } else {
                iMo21741t2 = this.f21159a.mo21741t();
            }
        } while (iMo21741t2 == this.f21160b);
        this.f21162d = iMo21741t2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: f */
    public final long mo21585f() throws C8978m1 {
        m21823b(0);
        return this.f21159a.mo21743v();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: f */
    public final void mo21586f(List list) throws C8984n1 {
        int iMo21741t;
        int iMo21741t2;
        if (!(list instanceof C8906a1)) {
            int i = this.f21160b & 7;
            if (i == 2) {
                int iMo21742u = this.f21159a.mo21742u();
                m21819c(iMo21742u);
                int iMo21719b = this.f21159a.mo21719b() + iMo21742u;
                do {
                    list.add(Integer.valueOf(this.f21159a.mo21735n()));
                } while (this.f21159a.mo21719b() < iMo21719b);
                return;
            }
            if (i != 5) {
                int i2 = C8984n1.f21076a;
                throw new C8978m1();
            }
            do {
                list.add(Integer.valueOf(this.f21159a.mo21735n()));
                if (this.f21159a.mo21721c()) {
                    return;
                } else {
                    iMo21741t = this.f21159a.mo21741t();
                }
            } while (iMo21741t == this.f21160b);
            this.f21162d = iMo21741t;
            return;
        }
        C8906a1 c8906a1 = (C8906a1) list;
        int i3 = this.f21160b & 7;
        if (i3 == 2) {
            int iMo21742u2 = this.f21159a.mo21742u();
            m21819c(iMo21742u2);
            int iMo21719b2 = this.f21159a.mo21719b() + iMo21742u2;
            do {
                c8906a1.m21503c(this.f21159a.mo21735n());
            } while (this.f21159a.mo21719b() < iMo21719b2);
            return;
        }
        if (i3 != 5) {
            int i4 = C8984n1.f21076a;
            throw new C8978m1();
        }
        do {
            c8906a1.m21503c(this.f21159a.mo21735n());
            if (this.f21159a.mo21721c()) {
                return;
            } else {
                iMo21741t2 = this.f21159a.mo21741t();
            }
        } while (iMo21741t2 == this.f21160b);
        this.f21162d = iMo21741t2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: g */
    public final long mo21587g() throws C8978m1 {
        m21823b(1);
        return this.f21159a.mo21730i();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: g */
    public final void mo21588g(List list) throws C8984n1 {
        int iMo21741t;
        int iMo21741t2;
        if (!(list instanceof C9023u1)) {
            int i = this.f21160b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.f21159a.mo21738q()));
                    if (this.f21159a.mo21721c()) {
                        return;
                    } else {
                        iMo21741t = this.f21159a.mo21741t();
                    }
                } while (iMo21741t == this.f21160b);
                this.f21162d = iMo21741t;
                return;
            }
            if (i != 2) {
                int i2 = C8984n1.f21076a;
                throw new C8978m1();
            }
            int iMo21719b = this.f21159a.mo21719b() + this.f21159a.mo21742u();
            do {
                list.add(Long.valueOf(this.f21159a.mo21738q()));
            } while (this.f21159a.mo21719b() < iMo21719b);
            m21821a(iMo21719b);
            return;
        }
        C9023u1 c9023u1 = (C9023u1) list;
        int i3 = this.f21160b & 7;
        if (i3 == 0) {
            do {
                c9023u1.m21775a(this.f21159a.mo21738q());
                if (this.f21159a.mo21721c()) {
                    return;
                } else {
                    iMo21741t2 = this.f21159a.mo21741t();
                }
            } while (iMo21741t2 == this.f21160b);
            this.f21162d = iMo21741t2;
            return;
        }
        if (i3 != 2) {
            int i4 = C8984n1.f21076a;
            throw new C8978m1();
        }
        int iMo21719b2 = this.f21159a.mo21719b() + this.f21159a.mo21742u();
        do {
            c9023u1.m21775a(this.f21159a.mo21738q());
        } while (this.f21159a.mo21719b() < iMo21719b2);
        m21821a(iMo21719b2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: h */
    public final double mo21589h() throws C8978m1 {
        m21823b(1);
        return this.f21159a.mo21726f();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: h */
    public final void mo21590h(List list) throws C8978m1 {
        int iMo21741t;
        if ((this.f21160b & 7) != 2) {
            int i = C8984n1.f21076a;
            throw new C8978m1();
        }
        do {
            m21823b(2);
            list.add(this.f21159a.mo21724e());
            if (this.f21159a.mo21721c()) {
                return;
            } else {
                iMo21741t = this.f21159a.mo21741t();
            }
        } while (iMo21741t == this.f21160b);
        this.f21162d = iMo21741t;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: i */
    public final void mo21591i(List list) throws C8984n1 {
        int iMo21741t;
        int iMo21741t2;
        if (!(list instanceof C8906a1)) {
            int i = this.f21160b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.f21159a.mo21742u()));
                    if (this.f21159a.mo21721c()) {
                        return;
                    } else {
                        iMo21741t = this.f21159a.mo21741t();
                    }
                } while (iMo21741t == this.f21160b);
                this.f21162d = iMo21741t;
                return;
            }
            if (i != 2) {
                int i2 = C8984n1.f21076a;
                throw new C8978m1();
            }
            int iMo21719b = this.f21159a.mo21719b() + this.f21159a.mo21742u();
            do {
                list.add(Integer.valueOf(this.f21159a.mo21742u()));
            } while (this.f21159a.mo21719b() < iMo21719b);
            m21821a(iMo21719b);
            return;
        }
        C8906a1 c8906a1 = (C8906a1) list;
        int i3 = this.f21160b & 7;
        if (i3 == 0) {
            do {
                c8906a1.m21503c(this.f21159a.mo21742u());
                if (this.f21159a.mo21721c()) {
                    return;
                } else {
                    iMo21741t2 = this.f21159a.mo21741t();
                }
            } while (iMo21741t2 == this.f21160b);
            this.f21162d = iMo21741t2;
            return;
        }
        if (i3 != 2) {
            int i4 = C8984n1.f21076a;
            throw new C8978m1();
        }
        int iMo21719b2 = this.f21159a.mo21719b() + this.f21159a.mo21742u();
        do {
            c8906a1.m21503c(this.f21159a.mo21742u());
        } while (this.f21159a.mo21719b() < iMo21719b2);
        m21821a(iMo21719b2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: i */
    public final boolean mo21592i() {
        int i;
        if (this.f21159a.mo21721c() || (i = this.f21160b) == this.f21161c) {
            return false;
        }
        return this.f21159a.mo21725e(i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: j */
    public final int mo21593j() throws C8978m1 {
        m21823b(0);
        return this.f21159a.mo21737p();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: j */
    public final void mo21594j(List list) throws C8984n1 {
        int iMo21741t;
        int iMo21741t2;
        if (!(list instanceof C8923d0)) {
            int i = this.f21160b & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(this.f21159a.mo21726f()));
                    if (this.f21159a.mo21721c()) {
                        return;
                    } else {
                        iMo21741t = this.f21159a.mo21741t();
                    }
                } while (iMo21741t == this.f21160b);
                this.f21162d = iMo21741t;
                return;
            }
            if (i != 2) {
                int i2 = C8984n1.f21076a;
                throw new C8978m1();
            }
            int iMo21742u = this.f21159a.mo21742u();
            m21820d(iMo21742u);
            int iMo21719b = this.f21159a.mo21719b() + iMo21742u;
            do {
                list.add(Double.valueOf(this.f21159a.mo21726f()));
            } while (this.f21159a.mo21719b() < iMo21719b);
            return;
        }
        C8923d0 c8923d0 = (C8923d0) list;
        int i3 = this.f21160b & 7;
        if (i3 == 1) {
            do {
                c8923d0.m21529a(this.f21159a.mo21726f());
                if (this.f21159a.mo21721c()) {
                    return;
                } else {
                    iMo21741t2 = this.f21159a.mo21741t();
                }
            } while (iMo21741t2 == this.f21160b);
            this.f21162d = iMo21741t2;
            return;
        }
        if (i3 != 2) {
            int i4 = C8984n1.f21076a;
            throw new C8978m1();
        }
        int iMo21742u2 = this.f21159a.mo21742u();
        m21820d(iMo21742u2);
        int iMo21719b2 = this.f21159a.mo21719b() + iMo21742u2;
        do {
            c8923d0.m21529a(this.f21159a.mo21726f());
        } while (this.f21159a.mo21719b() < iMo21719b2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: k */
    public final float mo21595k() throws C8978m1 {
        m21823b(5);
        return this.f21159a.mo21731j();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: k */
    public final void mo21596k(List list) throws C8984n1 {
        int iMo21741t;
        int iMo21741t2;
        if (!(list instanceof C9023u1)) {
            int i = this.f21160b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.f21159a.mo21733l()));
                    if (this.f21159a.mo21721c()) {
                        return;
                    } else {
                        iMo21741t = this.f21159a.mo21741t();
                    }
                } while (iMo21741t == this.f21160b);
                this.f21162d = iMo21741t;
                return;
            }
            if (i != 2) {
                int i2 = C8984n1.f21076a;
                throw new C8978m1();
            }
            int iMo21719b = this.f21159a.mo21719b() + this.f21159a.mo21742u();
            do {
                list.add(Long.valueOf(this.f21159a.mo21733l()));
            } while (this.f21159a.mo21719b() < iMo21719b);
            m21821a(iMo21719b);
            return;
        }
        C9023u1 c9023u1 = (C9023u1) list;
        int i3 = this.f21160b & 7;
        if (i3 == 0) {
            do {
                c9023u1.m21775a(this.f21159a.mo21733l());
                if (this.f21159a.mo21721c()) {
                    return;
                } else {
                    iMo21741t2 = this.f21159a.mo21741t();
                }
            } while (iMo21741t2 == this.f21160b);
            this.f21162d = iMo21741t2;
            return;
        }
        if (i3 != 2) {
            int i4 = C8984n1.f21076a;
            throw new C8978m1();
        }
        int iMo21719b2 = this.f21159a.mo21719b() + this.f21159a.mo21742u();
        do {
            c9023u1.m21775a(this.f21159a.mo21733l());
        } while (this.f21159a.mo21719b() < iMo21719b2);
        m21821a(iMo21719b2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: l */
    public final long mo21597l() throws C8978m1 {
        m21823b(0);
        return this.f21159a.mo21738q();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: l */
    public final void mo21598l(List list) throws C8984n1 {
        int iMo21741t;
        int iMo21741t2;
        if (!(list instanceof C8958j)) {
            int i = this.f21160b & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(this.f21159a.mo21723d()));
                    if (this.f21159a.mo21721c()) {
                        return;
                    } else {
                        iMo21741t = this.f21159a.mo21741t();
                    }
                } while (iMo21741t == this.f21160b);
                this.f21162d = iMo21741t;
                return;
            }
            if (i != 2) {
                int i2 = C8984n1.f21076a;
                throw new C8978m1();
            }
            int iMo21719b = this.f21159a.mo21719b() + this.f21159a.mo21742u();
            do {
                list.add(Boolean.valueOf(this.f21159a.mo21723d()));
            } while (this.f21159a.mo21719b() < iMo21719b);
            m21821a(iMo21719b);
            return;
        }
        C8958j c8958j = (C8958j) list;
        int i3 = this.f21160b & 7;
        if (i3 == 0) {
            do {
                c8958j.m21656a(this.f21159a.mo21723d());
                if (this.f21159a.mo21721c()) {
                    return;
                } else {
                    iMo21741t2 = this.f21159a.mo21741t();
                }
            } while (iMo21741t2 == this.f21160b);
            this.f21162d = iMo21741t2;
            return;
        }
        if (i3 != 2) {
            int i4 = C8984n1.f21076a;
            throw new C8978m1();
        }
        int iMo21719b2 = this.f21159a.mo21719b() + this.f21159a.mo21742u();
        do {
            c8958j.m21656a(this.f21159a.mo21723d());
        } while (this.f21159a.mo21719b() < iMo21719b2);
        m21821a(iMo21719b2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: m */
    public final int mo21599m() throws C8978m1 {
        m21823b(5);
        return this.f21159a.mo21735n();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: m */
    public final void mo21600m(List list) throws C8984n1 {
        int iMo21741t;
        int iMo21741t2;
        if (!(list instanceof C9023u1)) {
            int i = this.f21160b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(this.f21159a.mo21736o()));
                    if (this.f21159a.mo21721c()) {
                        return;
                    } else {
                        iMo21741t = this.f21159a.mo21741t();
                    }
                } while (iMo21741t == this.f21160b);
                this.f21162d = iMo21741t;
                return;
            }
            if (i != 2) {
                int i2 = C8984n1.f21076a;
                throw new C8978m1();
            }
            int iMo21742u = this.f21159a.mo21742u();
            m21820d(iMo21742u);
            int iMo21719b = this.f21159a.mo21719b() + iMo21742u;
            do {
                list.add(Long.valueOf(this.f21159a.mo21736o()));
            } while (this.f21159a.mo21719b() < iMo21719b);
            return;
        }
        C9023u1 c9023u1 = (C9023u1) list;
        int i3 = this.f21160b & 7;
        if (i3 == 1) {
            do {
                c9023u1.m21775a(this.f21159a.mo21736o());
                if (this.f21159a.mo21721c()) {
                    return;
                } else {
                    iMo21741t2 = this.f21159a.mo21741t();
                }
            } while (iMo21741t2 == this.f21160b);
            this.f21162d = iMo21741t2;
            return;
        }
        if (i3 != 2) {
            int i4 = C8984n1.f21076a;
            throw new C8978m1();
        }
        int iMo21742u2 = this.f21159a.mo21742u();
        m21820d(iMo21742u2);
        int iMo21719b2 = this.f21159a.mo21719b() + iMo21742u2;
        do {
            c9023u1.m21775a(this.f21159a.mo21736o());
        } while (this.f21159a.mo21719b() < iMo21719b2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: n */
    public final String mo21601n() throws C8978m1 {
        m21823b(2);
        return this.f21159a.mo21739r();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: n */
    public final void mo21602n(List list) throws C8984n1 {
        int iMo21741t;
        int iMo21741t2;
        if (!(list instanceof C9023u1)) {
            int i = this.f21160b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(this.f21159a.mo21730i()));
                    if (this.f21159a.mo21721c()) {
                        return;
                    } else {
                        iMo21741t = this.f21159a.mo21741t();
                    }
                } while (iMo21741t == this.f21160b);
                this.f21162d = iMo21741t;
                return;
            }
            if (i != 2) {
                int i2 = C8984n1.f21076a;
                throw new C8978m1();
            }
            int iMo21742u = this.f21159a.mo21742u();
            m21820d(iMo21742u);
            int iMo21719b = this.f21159a.mo21719b() + iMo21742u;
            do {
                list.add(Long.valueOf(this.f21159a.mo21730i()));
            } while (this.f21159a.mo21719b() < iMo21719b);
            return;
        }
        C9023u1 c9023u1 = (C9023u1) list;
        int i3 = this.f21160b & 7;
        if (i3 == 1) {
            do {
                c9023u1.m21775a(this.f21159a.mo21730i());
                if (this.f21159a.mo21721c()) {
                    return;
                } else {
                    iMo21741t2 = this.f21159a.mo21741t();
                }
            } while (iMo21741t2 == this.f21160b);
            this.f21162d = iMo21741t2;
            return;
        }
        if (i3 != 2) {
            int i4 = C8984n1.f21076a;
            throw new C8978m1();
        }
        int iMo21742u2 = this.f21159a.mo21742u();
        m21820d(iMo21742u2);
        int iMo21719b2 = this.f21159a.mo21719b() + iMo21742u2;
        do {
            c9023u1.m21775a(this.f21159a.mo21730i());
        } while (this.f21159a.mo21719b() < iMo21719b2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: o */
    public final long mo21603o() throws C8978m1 {
        m21823b(0);
        return this.f21159a.mo21733l();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: o */
    public final void mo21604o(List list) throws C8984n1 {
        int iMo21741t;
        int iMo21741t2;
        if (!(list instanceof C8906a1)) {
            int i = this.f21160b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.f21159a.mo21732k()));
                    if (this.f21159a.mo21721c()) {
                        return;
                    } else {
                        iMo21741t = this.f21159a.mo21741t();
                    }
                } while (iMo21741t == this.f21160b);
                this.f21162d = iMo21741t;
                return;
            }
            if (i != 2) {
                int i2 = C8984n1.f21076a;
                throw new C8978m1();
            }
            int iMo21719b = this.f21159a.mo21719b() + this.f21159a.mo21742u();
            do {
                list.add(Integer.valueOf(this.f21159a.mo21732k()));
            } while (this.f21159a.mo21719b() < iMo21719b);
            m21821a(iMo21719b);
            return;
        }
        C8906a1 c8906a1 = (C8906a1) list;
        int i3 = this.f21160b & 7;
        if (i3 == 0) {
            do {
                c8906a1.m21503c(this.f21159a.mo21732k());
                if (this.f21159a.mo21721c()) {
                    return;
                } else {
                    iMo21741t2 = this.f21159a.mo21741t();
                }
            } while (iMo21741t2 == this.f21160b);
            this.f21162d = iMo21741t2;
            return;
        }
        if (i3 != 2) {
            int i4 = C8984n1.f21076a;
            throw new C8978m1();
        }
        int iMo21719b2 = this.f21159a.mo21719b() + this.f21159a.mo21742u();
        do {
            c8906a1.m21503c(this.f21159a.mo21732k());
        } while (this.f21159a.mo21719b() < iMo21719b2);
        m21821a(iMo21719b2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: p */
    public final String mo21605p() throws C8978m1 {
        m21823b(2);
        return this.f21159a.mo21740s();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: p */
    public final void mo21606p(List list) throws C8984n1 {
        int iMo21741t;
        int iMo21741t2;
        if (!(list instanceof C8906a1)) {
            int i = this.f21160b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.f21159a.mo21728g()));
                    if (this.f21159a.mo21721c()) {
                        return;
                    } else {
                        iMo21741t = this.f21159a.mo21741t();
                    }
                } while (iMo21741t == this.f21160b);
                this.f21162d = iMo21741t;
                return;
            }
            if (i != 2) {
                int i2 = C8984n1.f21076a;
                throw new C8978m1();
            }
            int iMo21719b = this.f21159a.mo21719b() + this.f21159a.mo21742u();
            do {
                list.add(Integer.valueOf(this.f21159a.mo21728g()));
            } while (this.f21159a.mo21719b() < iMo21719b);
            m21821a(iMo21719b);
            return;
        }
        C8906a1 c8906a1 = (C8906a1) list;
        int i3 = this.f21160b & 7;
        if (i3 == 0) {
            do {
                c8906a1.m21503c(this.f21159a.mo21728g());
                if (this.f21159a.mo21721c()) {
                    return;
                } else {
                    iMo21741t2 = this.f21159a.mo21741t();
                }
            } while (iMo21741t2 == this.f21160b);
            this.f21162d = iMo21741t2;
            return;
        }
        if (i3 != 2) {
            int i4 = C8984n1.f21076a;
            throw new C8978m1();
        }
        int iMo21719b2 = this.f21159a.mo21719b() + this.f21159a.mo21742u();
        do {
            c8906a1.m21503c(this.f21159a.mo21728g());
        } while (this.f21159a.mo21719b() < iMo21719b2);
        m21821a(iMo21719b2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: q */
    public final int mo21607q() throws C8978m1 {
        m21823b(5);
        return this.f21159a.mo21729h();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: q */
    public final void mo21608q(List list) throws C8978m1 {
        m21822a(list, false);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: r */
    public final boolean mo21609r() throws C8978m1 {
        m21823b(0);
        return this.f21159a.mo21723d();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: s */
    public final int mo21610s() {
        int i = this.f21162d;
        if (i != 0) {
            this.f21160b = i;
            this.f21162d = 0;
        } else {
            this.f21160b = this.f21159a.mo21741t();
        }
        int i2 = this.f21160b;
        if (i2 == 0 || i2 == this.f21161c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9014s2
    /* JADX INFO: renamed from: t */
    public final long mo21611t() throws C8978m1 {
        m21823b(1);
        return this.f21159a.mo21736o();
    }
}
