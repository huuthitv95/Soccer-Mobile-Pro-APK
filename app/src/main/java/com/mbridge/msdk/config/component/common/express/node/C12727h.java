package com.mbridge.msdk.config.component.common.express.node;

import com.mbridge.msdk.config.component.common.express.C12717d;
import com.mbridge.msdk.config.component.common.express.EnumC12718e;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.node.h */
/* JADX INFO: compiled from: MapNode.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12727h extends AbstractC12723d {

    /* JADX INFO: renamed from: a */
    List<AbstractC12723d> f33878a;

    public C12727h(List<AbstractC12723d> list) {
        this.f33878a = list;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.AbstractC12723d
    /* JADX INFO: renamed from: a */
    public Object mo34898a(C12717d c12717d, EnumC12718e enumC12718e, C12894a c12894a) {
        HashMap map = new HashMap();
        Iterator<AbstractC12723d> it = this.f33878a.iterator();
        while (it.hasNext()) {
            Object objMo34898a = it.next().mo34898a(c12717d, enumC12718e, c12894a);
            map.putAll(objMo34898a instanceof Map ? (HashMap) objMo34898a : new HashMap());
        }
        return map;
    }
}
