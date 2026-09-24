package com.mbridge.msdk.config.component.common.express.node;

import com.mbridge.msdk.config.component.common.express.C12717d;
import com.mbridge.msdk.config.component.common.express.EnumC12718e;
import com.mbridge.msdk.config.component.common.express.entities.C12719a;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.node.c */
/* JADX INFO: compiled from: BinaryOpNode.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12722c extends AbstractC12723d {

    /* JADX INFO: renamed from: a */
    String f33868a;

    /* JADX INFO: renamed from: b */
    AbstractC12723d f33869b;

    /* JADX INFO: renamed from: c */
    AbstractC12723d f33870c;

    public C12722c(String str, AbstractC12723d abstractC12723d, AbstractC12723d abstractC12723d2) {
        this.f33868a = str;
        this.f33869b = abstractC12723d;
        this.f33870c = abstractC12723d2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.AbstractC12723d
    /* JADX INFO: renamed from: a */
    public Object mo34898a(C12717d c12717d, EnumC12718e enumC12718e, C12894a c12894a) {
        Object objMo34898a = this.f33869b.mo34898a(c12717d, enumC12718e, c12894a);
        Object objMo34898a2 = this.f33870c.mo34898a(c12717d, enumC12718e, c12894a);
        if (enumC12718e != EnumC12718e.ASSIGNMENT) {
            List<Object> arrayList = new ArrayList<>();
            arrayList.add(objMo34898a2);
            return c12717d.m34891a(objMo34898a, arrayList, this.f33868a, c12894a);
        }
        C12719a c12719a = new C12719a();
        if (!(objMo34898a instanceof C12719a)) {
            return null;
        }
        C12719a c12719a2 = (C12719a) objMo34898a;
        String strM34894a = c12719a2.m34894a();
        List<Object> arrayList2 = new ArrayList<>();
        arrayList2.add(objMo34898a2);
        Object objM34891a = c12717d.m34891a(c12719a2, arrayList2, this.f33868a, c12894a);
        c12719a.m34896a(strM34894a);
        c12719a.m34895a(objM34891a);
        return c12719a;
    }
}
