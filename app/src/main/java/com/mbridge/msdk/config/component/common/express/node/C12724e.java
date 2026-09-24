package com.mbridge.msdk.config.component.common.express.node;

import com.mbridge.msdk.config.component.common.express.C12717d;
import com.mbridge.msdk.config.component.common.express.EnumC12718e;
import com.mbridge.msdk.config.component.common.express.operator.parts.CallableC12747b;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.node.e */
/* JADX INFO: compiled from: FunctionCallNode.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12724e extends AbstractC12723d {

    /* JADX INFO: renamed from: a */
    AbstractC12723d f33871a;

    /* JADX INFO: renamed from: b */
    String f33872b;

    /* JADX INFO: renamed from: c */
    List<AbstractC12723d> f33873c;

    public C12724e(AbstractC12723d abstractC12723d, String str, List<AbstractC12723d> list) {
        this.f33871a = abstractC12723d;
        this.f33872b = str;
        this.f33873c = list;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.AbstractC12723d
    /* JADX INFO: renamed from: a */
    public Object mo34898a(C12717d c12717d, EnumC12718e enumC12718e, C12894a c12894a) {
        if (this.f33873c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (Arrays.asList(C12770c.m35209b("876"), C12770c.m35209b("877"), C12770c.m35209b("878")).contains(this.f33872b)) {
            arrayList.add(new CallableC12747b(c12717d, enumC12718e, this.f33873c.get(0), c12894a));
            for (int i = 1; i < this.f33873c.size(); i++) {
                arrayList.add(this.f33873c.get(i).mo34898a(c12717d, enumC12718e, c12894a));
            }
        } else {
            Iterator<AbstractC12723d> it = this.f33873c.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().mo34898a(c12717d, enumC12718e, c12894a));
            }
        }
        return c12717d.m34891a(this.f33871a.mo34898a(c12717d, enumC12718e, c12894a), arrayList, this.f33872b, c12894a);
    }
}
