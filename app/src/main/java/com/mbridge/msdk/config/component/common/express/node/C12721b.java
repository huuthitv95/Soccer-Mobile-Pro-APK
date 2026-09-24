package com.mbridge.msdk.config.component.common.express.node;

import com.ironsource.C11744X3;
import com.mbridge.msdk.config.component.common.express.C12717d;
import com.mbridge.msdk.config.component.common.express.EnumC12718e;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import java.util.ArrayList;
import java.util.Set;
import kotlin.UByte$$ExternalSyntheticBackport0;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.node.b */
/* JADX INFO: compiled from: AssignmentNode.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12721b extends AbstractC12723d {

    /* JADX INFO: renamed from: d */
    private static final Set<String> f33864d = UByte$$ExternalSyntheticBackport0.m43498m(new Object[]{C11744X3.j.f26434b, "+=", "-=", "*=", "/=", "%="});

    /* JADX INFO: renamed from: a */
    String f33865a;

    /* JADX INFO: renamed from: b */
    AbstractC12723d f33866b;

    /* JADX INFO: renamed from: c */
    AbstractC12723d f33867c;

    public C12721b(String str, AbstractC12723d abstractC12723d, AbstractC12723d abstractC12723d2) {
        this.f33865a = str;
        this.f33866b = abstractC12723d;
        this.f33867c = abstractC12723d2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.AbstractC12723d
    /* JADX INFO: renamed from: a */
    public Object mo34898a(C12717d c12717d, EnumC12718e enumC12718e, C12894a c12894a) {
        Object objMo34898a = this.f33866b.mo34898a(c12717d, EnumC12718e.ASSIGNMENT, c12894a);
        Object objMo34898a2 = this.f33867c.mo34898a(c12717d, enumC12718e, c12894a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(objMo34898a2);
        return c12717d.m34891a(objMo34898a, arrayList, this.f33865a, c12894a);
    }
}
