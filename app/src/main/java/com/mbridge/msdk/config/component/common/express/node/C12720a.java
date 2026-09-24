package com.mbridge.msdk.config.component.common.express.node;

import com.mbridge.msdk.config.component.common.express.C12717d;
import com.mbridge.msdk.config.component.common.express.EnumC12718e;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.node.a */
/* JADX INFO: compiled from: ArrayNode.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12720a extends AbstractC12723d {

    /* JADX INFO: renamed from: a */
    List<AbstractC12723d> f33863a;

    public C12720a(List<AbstractC12723d> list) {
        this.f33863a = list;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.AbstractC12723d
    /* JADX INFO: renamed from: a */
    public Object mo34898a(C12717d c12717d, EnumC12718e enumC12718e, C12894a c12894a) {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC12723d> it = this.f33863a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo34898a(c12717d, enumC12718e, c12894a));
        }
        return arrayList;
    }
}
