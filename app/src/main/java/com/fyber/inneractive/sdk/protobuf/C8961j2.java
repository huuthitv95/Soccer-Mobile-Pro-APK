package com.fyber.inneractive.sdk.protobuf;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.j2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8961j2 implements InterfaceC9019t2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8925d2 f21054a;

    /* JADX INFO: renamed from: b */
    public final C8992o3 f21055b;

    /* JADX INFO: renamed from: c */
    public final boolean f21056c;

    /* JADX INFO: renamed from: d */
    public final C8959j0 f21057d;

    public C8961j2(C8992o3 c8992o3, C8959j0 c8959j0, InterfaceC8925d2 interfaceC8925d2) {
        this.f21055b = c8992o3;
        c8959j0.getClass();
        this.f21056c = interfaceC8925d2 instanceof GeneratedMessageLite$ExtendableMessage;
        this.f21057d = c8959j0;
        this.f21054a = interfaceC8925d2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9019t2
    /* JADX INFO: renamed from: a */
    public final Object mo21629a() {
        return ((AbstractC9017t0) this.f21054a.newBuilderForType()).m21752b();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9019t2
    /* JADX INFO: renamed from: a */
    public final void mo21635a(Object obj, C8917c0 c8917c0) {
        this.f21057d.getClass();
        Iterator itM21684d = ((GeneratedMessageLite$ExtendableMessage) obj).extensions.m21684d();
        while (itM21684d.hasNext()) {
            Map.Entry entry = (Map.Entry) itM21684d.next();
            C9032w0 c9032w0 = (C9032w0) entry.getKey();
            if (c9032w0.f21151c.m21661a() != EnumC8969k4.MESSAGE || c9032w0.f21152d || c9032w0.f21153e) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            int i = c9032w0.f21150b;
            Object value = entry.getValue();
            c8917c0.getClass();
            if (value instanceof AbstractC9011s) {
                c8917c0.f20990a.mo21485b(i, (AbstractC9011s) value);
            } else {
                c8917c0.f20990a.mo21476a(i, (InterfaceC8925d2) value);
            }
        }
        this.f21055b.getClass();
        C8986n3 c8986n3 = ((AbstractC9047z0) obj).unknownFields;
        c8986n3.getClass();
        c8917c0.getClass();
        if (EnumC9005q4.ASCENDING == EnumC9005q4.DESCENDING) {
            for (int i2 = c8986n3.f21078a - 1; i2 >= 0; i2--) {
                int i3 = c8986n3.f21079b[i2] >>> 3;
                Object obj2 = c8986n3.f21080c[i2];
                if (obj2 instanceof AbstractC9011s) {
                    c8917c0.f20990a.mo21485b(i3, (AbstractC9011s) obj2);
                } else {
                    c8917c0.f20990a.mo21476a(i3, (InterfaceC8925d2) obj2);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < c8986n3.f21078a; i4++) {
            int i5 = c8986n3.f21079b[i4] >>> 3;
            Object obj3 = c8986n3.f21080c[i4];
            if (obj3 instanceof AbstractC9011s) {
                c8917c0.f20990a.mo21485b(i5, (AbstractC9011s) obj3);
            } else {
                c8917c0.f20990a.mo21476a(i5, (InterfaceC8925d2) obj3);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9019t2
    /* JADX INFO: renamed from: a */
    public final void mo21636a(Object obj, InterfaceC9014s2 interfaceC9014s2, C8947h0 c8947h0) {
        C8992o3 c8992o3 = this.f21055b;
        C8959j0 c8959j0 = this.f21057d;
        c8992o3.getClass();
        AbstractC9047z0 abstractC9047z0 = (AbstractC9047z0) obj;
        C8986n3 c8986n3 = abstractC9047z0.unknownFields;
        if (c8986n3 == C8986n3.f21077f) {
            c8986n3 = new C8986n3();
            abstractC9047z0.unknownFields = c8986n3;
        }
        C8986n3 c8986n4 = c8986n3;
        c8959j0.getClass();
        C8983n0 c8983n0EnsureExtensionsAreMutable = ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable();
        while (interfaceC9014s2.mo21610s() != Integer.MAX_VALUE) {
            try {
                InterfaceC9014s2 interfaceC9014s3 = interfaceC9014s2;
                C8947h0 c8947h1 = c8947h0;
                if (!m21660a(interfaceC9014s3, c8947h1, c8959j0, c8983n0EnsureExtensionsAreMutable, c8992o3, c8986n4)) {
                    break;
                }
                interfaceC9014s2 = interfaceC9014s3;
                c8947h0 = c8947h1;
            } finally {
                abstractC9047z0.unknownFields = c8986n4;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9019t2
    /* JADX INFO: renamed from: a */
    public final void mo21637a(Object obj, Object obj2) {
        C8992o3 c8992o3 = this.f21055b;
        Class cls = AbstractC9024u2.f21133a;
        c8992o3.getClass();
        AbstractC9047z0 abstractC9047z0 = (AbstractC9047z0) obj;
        C8986n3 c8986n3M21686a = abstractC9047z0.unknownFields;
        C8986n3 c8986n3 = ((AbstractC9047z0) obj2).unknownFields;
        if (!c8986n3.equals(C8986n3.f21077f)) {
            c8986n3M21686a = C8986n3.m21686a(c8986n3M21686a, c8986n3);
        }
        abstractC9047z0.unknownFields = c8986n3M21686a;
        if (this.f21056c) {
            this.f21057d.getClass();
            C8983n0 c8983n0 = ((GeneratedMessageLite$ExtendableMessage) obj2).extensions;
            if (c8983n0.f21073a.isEmpty()) {
                return;
            }
            ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable().m21678a(c8983n0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d1 A[EDGE_INSN: B:68:0x00d1->B:42:0x00d1 BREAK  A[LOOP:1: B:17:0x0066->B:73:0x0066], SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9019t2
    /* JADX INFO: renamed from: a */
    public final void mo21638a(Object obj, byte[] bArr, int i, int i2, C8934f c8934f) throws C8984n1 {
        int iM21546a;
        AbstractC9047z0 abstractC9047z0 = (AbstractC9047z0) obj;
        C8986n3 c8986n3 = abstractC9047z0.unknownFields;
        if (c8986n3 == C8986n3.f21077f) {
            c8986n3 = new C8986n3();
            abstractC9047z0.unknownFields = c8986n3;
        }
        C8986n3 c8986n4 = c8986n3;
        C8983n0 c8983n0EnsureExtensionsAreMutable = ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable();
        C9037x0 c9037x0M21618a = null;
        while (i < i2) {
            int iM21556d = AbstractC8940g.m21556d(bArr, i, c8934f);
            int i3 = c8934f.f21012a;
            if (i3 == 11) {
                int i4 = i2;
                C8934f c8934f2 = c8934f;
                int i5 = 0;
                AbstractC9011s abstractC9011s = null;
                while (true) {
                    if (iM21556d >= i4) {
                        iM21546a = iM21556d;
                        break;
                    }
                    iM21546a = iM21556d + 1;
                    byte b = bArr[iM21556d];
                    if (b >= 0) {
                        c8934f2.f21012a = b;
                    } else {
                        iM21546a = AbstractC8940g.m21546a(b, bArr, iM21546a, c8934f2);
                    }
                    int i6 = c8934f2.f21012a;
                    int i7 = i6 >>> 3;
                    int i8 = i6 & 7;
                    if (i7 != 2) {
                        if (i7 == 3) {
                            if (c9037x0M21618a != null) {
                                iM21556d = AbstractC8940g.m21548a(C8997p2.f21087c.m21698a(c9037x0M21618a.f21165c.getClass()), bArr, iM21546a, i4, c8934f2);
                                c8983n0EnsureExtensionsAreMutable.m21681c(c9037x0M21618a.f21166d, c8934f2.f21014c);
                            } else if (i8 == 2) {
                                iM21556d = AbstractC8940g.m21549a(bArr, iM21546a, c8934f2);
                                abstractC9011s = (AbstractC9011s) c8934f2.f21014c;
                            }
                        }
                        if (i6 == 12) {
                            break;
                        } else {
                            iM21556d = AbstractC8940g.m21543a(i6, bArr, iM21546a, i4, c8934f2);
                        }
                    } else if (i8 == 0) {
                        int iM21546a2 = iM21546a + 1;
                        byte b2 = bArr[iM21546a];
                        if (b2 >= 0) {
                            c8934f2.f21012a = b2;
                        } else {
                            iM21546a2 = AbstractC8940g.m21546a(b2, bArr, iM21546a2, c8934f2);
                        }
                        iM21556d = iM21546a2;
                        i5 = c8934f2.f21012a;
                        C8959j0 c8959j0 = this.f21057d;
                        C8947h0 c8947h0 = c8934f2.f21015d;
                        InterfaceC8925d2 interfaceC8925d2 = this.f21054a;
                        c8959j0.getClass();
                        c9037x0M21618a = c8947h0.m21618a(i5, interfaceC8925d2);
                    } else {
                        if (i6 == 12) {
                            break;
                            break;
                        }
                        iM21556d = AbstractC8940g.m21543a(i6, bArr, iM21546a, i4, c8934f2);
                    }
                }
                if (abstractC9011s != null) {
                    c8986n4.m21688a((i5 << 3) | 2, abstractC9011s);
                }
                i = iM21546a;
                i2 = i4;
                c8934f = c8934f2;
            } else if ((i3 & 7) == 2) {
                C8959j0 c8959j1 = this.f21057d;
                C8947h0 c8947h1 = c8934f.f21015d;
                InterfaceC8925d2 interfaceC8925d3 = this.f21054a;
                c8959j1.getClass();
                c9037x0M21618a = c8947h1.m21618a(i3 >>> 3, interfaceC8925d3);
                if (c9037x0M21618a != null) {
                    i = AbstractC8940g.m21548a(C8997p2.f21087c.m21698a(c9037x0M21618a.f21165c.getClass()), bArr, iM21556d, i2, c8934f);
                    c8983n0EnsureExtensionsAreMutable.m21681c(c9037x0M21618a.f21166d, c8934f.f21014c);
                } else {
                    i = AbstractC8940g.m21545a(i3, bArr, iM21556d, i2, c8986n4, c8934f);
                }
            } else {
                i = AbstractC8940g.m21543a(i3, bArr, iM21556d, i2, c8934f);
            }
        }
        if (i != i2) {
            throw new C8984n1("Failed to parse the message.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21660a(InterfaceC9014s2 interfaceC9014s2, C8947h0 c8947h0, C8959j0 c8959j0, C8983n0 c8983n0, C8992o3 c8992o3, C8986n3 c8986n3) throws C8984n1 {
        byte[] bArr;
        int iMo21582e = interfaceC9014s2.mo21582e();
        if (iMo21582e != 11) {
            if ((iMo21582e & 7) != 2) {
                return interfaceC9014s2.mo21592i();
            }
            InterfaceC8925d2 interfaceC8925d2 = this.f21054a;
            c8959j0.getClass();
            C9037x0 c9037x0M21618a = c8947h0.m21618a(iMo21582e >>> 3, interfaceC8925d2);
            if (c9037x0M21618a == null) {
                c8992o3.getClass();
                return C8992o3.m21692a((Object) c8986n3, interfaceC9014s2);
            }
            c8983n0.m21681c(c9037x0M21618a.f21166d, interfaceC9014s2.mo21570b(c9037x0M21618a.f21165c.getClass(), c8947h0));
            return true;
        }
        C9037x0 c9037x0M21618a2 = null;
        int iMo21574c = 0;
        AbstractC9011s abstractC9011sMo21560a = null;
        while (interfaceC9014s2.mo21610s() != Integer.MAX_VALUE) {
            int iMo21582e2 = interfaceC9014s2.mo21582e();
            if (iMo21582e2 == 16) {
                iMo21574c = interfaceC9014s2.mo21574c();
                InterfaceC8925d2 interfaceC8925d3 = this.f21054a;
                c8959j0.getClass();
                c9037x0M21618a2 = c8947h0.m21618a(iMo21574c, interfaceC8925d3);
            } else if (iMo21582e2 == 26) {
                if (c9037x0M21618a2 != null) {
                    c8959j0.getClass();
                    c8983n0.m21681c(c9037x0M21618a2.f21166d, interfaceC9014s2.mo21570b(c9037x0M21618a2.f21165c.getClass(), c8947h0));
                } else {
                    abstractC9011sMo21560a = interfaceC9014s2.mo21560a();
                }
            } else if (!interfaceC9014s2.mo21592i()) {
                break;
            }
        }
        if (interfaceC9014s2.mo21582e() != 12) {
            throw new C8984n1("Protocol message end-group tag did not match expected tag.");
        }
        if (abstractC9011sMo21560a != null) {
            if (c9037x0M21618a2 != null) {
                c8959j0.getClass();
                AbstractC9047z0 abstractC9047z0M21752b = ((AbstractC9017t0) c9037x0M21618a2.f21165c.newBuilderForType()).m21752b();
                int size = abstractC9011sMo21560a.size();
                if (size == 0) {
                    bArr = AbstractC8972l1.f21065b;
                } else {
                    byte[] bArr2 = new byte[size];
                    abstractC9011sMo21560a.mo21668a(size, bArr2);
                    bArr = bArr2;
                }
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                if (!byteBufferWrap.hasArray()) {
                    throw new IllegalArgumentException("Direct buffers not yet supported");
                }
                C8946h c8946h = new C8946h(byteBufferWrap);
                C8997p2 c8997p2 = C8997p2.f21087c;
                c8997p2.getClass();
                c8997p2.m21698a(abstractC9047z0M21752b.getClass()).mo21636a(abstractC9047z0M21752b, c8946h, c8947h0);
                c8983n0.m21681c(c9037x0M21618a2.f21166d, abstractC9047z0M21752b);
                if (c8946h.mo21610s() != Integer.MAX_VALUE) {
                    throw new C8984n1("Protocol message end-group tag did not match expected tag.");
                }
            } else {
                c8992o3.getClass();
                c8986n3.m21688a((iMo21574c << 3) | 2, abstractC9011sMo21560a);
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9019t2
    /* JADX INFO: renamed from: a */
    public final boolean mo21641a(Object obj) {
        this.f21057d.getClass();
        return ((GeneratedMessageLite$ExtendableMessage) obj).extensions.m21683c();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9019t2
    /* JADX INFO: renamed from: b */
    public final int mo21643b(Object obj) {
        this.f21055b.getClass();
        C8986n3 c8986n3 = ((AbstractC9047z0) obj).unknownFields;
        int i = c8986n3.f21081d;
        if (i == -1) {
            int iM21512a = 0;
            for (int i2 = 0; i2 < c8986n3.f21078a; i2++) {
                int i3 = c8986n3.f21079b[i2] >>> 3;
                iM21512a += AbstractC8911b0.m21512a((AbstractC9011s) c8986n3.f21080c[i2]) + AbstractC8911b0.m21514b(3) + AbstractC8911b0.m21516c(i3) + AbstractC8911b0.m21514b(2) + (AbstractC8911b0.m21514b(1) * 2);
            }
            c8986n3.f21081d = iM21512a;
            i = iM21512a;
        }
        if (!this.f21056c) {
            return i;
        }
        this.f21057d.getClass();
        return ((GeneratedMessageLite$ExtendableMessage) obj).extensions.m21677a() + i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9019t2
    /* JADX INFO: renamed from: b */
    public final boolean mo21649b(Object obj, Object obj2) {
        this.f21055b.getClass();
        C8986n3 c8986n3 = ((AbstractC9047z0) obj).unknownFields;
        this.f21055b.getClass();
        if (!c8986n3.equals(((AbstractC9047z0) obj2).unknownFields)) {
            return false;
        }
        if (!this.f21056c) {
            return true;
        }
        this.f21057d.getClass();
        C8983n0 c8983n0 = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
        this.f21057d.getClass();
        return c8983n0.equals(((GeneratedMessageLite$ExtendableMessage) obj2).extensions);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9019t2
    /* JADX INFO: renamed from: c */
    public final void mo21652c(Object obj) {
        this.f21055b.getClass();
        ((AbstractC9047z0) obj).unknownFields.f21082e = false;
        this.f21057d.getClass();
        ((GeneratedMessageLite$ExtendableMessage) obj).extensions.m21685e();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9019t2
    /* JADX INFO: renamed from: d */
    public final int mo21653d(Object obj) {
        this.f21055b.getClass();
        int iHashCode = ((AbstractC9047z0) obj).unknownFields.hashCode();
        if (!this.f21056c) {
            return iHashCode;
        }
        this.f21057d.getClass();
        return ((GeneratedMessageLite$ExtendableMessage) obj).extensions.f21073a.hashCode() + (iHashCode * 53);
    }
}
