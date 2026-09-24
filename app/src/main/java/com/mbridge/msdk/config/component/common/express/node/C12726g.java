package com.mbridge.msdk.config.component.common.express.node;

import com.mbridge.msdk.config.component.common.express.C12717d;
import com.mbridge.msdk.config.component.common.express.EnumC12718e;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import java.util.HashMap;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.node.g */
/* JADX INFO: compiled from: MapKeyValueNode.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12726g extends AbstractC12723d {

    /* JADX INFO: renamed from: a */
    AbstractC12723d f33876a;

    /* JADX INFO: renamed from: b */
    AbstractC12723d f33877b;

    public C12726g(AbstractC12723d abstractC12723d, AbstractC12723d abstractC12723d2) {
        this.f33876a = abstractC12723d;
        this.f33877b = abstractC12723d2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.AbstractC12723d
    /* JADX INFO: renamed from: a */
    public Object mo34898a(C12717d c12717d, EnumC12718e enumC12718e, C12894a c12894a) {
        Object objMo34898a = this.f33876a.mo34898a(c12717d, enumC12718e, c12894a);
        Object objMo34898a2 = this.f33877b.mo34898a(c12717d, enumC12718e, c12894a);
        HashMap map = new HashMap();
        map.put(objMo34898a, objMo34898a2);
        return map;
    }
}
