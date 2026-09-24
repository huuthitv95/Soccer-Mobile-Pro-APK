package com.mbridge.msdk.config.component.common.express.node;

import com.mbridge.msdk.config.component.common.express.C12716c;
import com.mbridge.msdk.config.component.common.express.C12717d;
import com.mbridge.msdk.config.component.common.express.EnumC12718e;
import com.mbridge.msdk.config.component.common.express.entities.C12719a;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.node.i */
/* JADX INFO: compiled from: ValueNode.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12728i extends AbstractC12723d {

    /* JADX INFO: renamed from: a */
    String f33879a;

    public C12728i(String str) {
        this.f33879a = str;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.AbstractC12723d
    /* JADX INFO: renamed from: a */
    public Object mo34898a(C12717d c12717d, EnumC12718e enumC12718e, C12894a c12894a) {
        Object objSubstring;
        if (this.f33879a.startsWith("$")) {
            objSubstring = C12716c.m34889a(this.f33879a, c12894a);
        } else if (this.f33879a.startsWith("\\") && this.f33879a.endsWith("\\\"")) {
            StringBuilder sb = new StringBuilder();
            String str = this.f33879a;
            sb.append(str.substring(1, str.length() - 2));
            sb.append("\"");
            objSubstring = sb.toString();
        } else if (this.f33879a.startsWith("\"") && this.f33879a.endsWith("\"")) {
            String str2 = this.f33879a;
            objSubstring = str2.substring(1, str2.length() - 1);
        } else {
            objSubstring = this.f33879a;
        }
        if (enumC12718e != EnumC12718e.ASSIGNMENT) {
            return objSubstring;
        }
        C12719a c12719a = new C12719a();
        c12719a.m34895a(c12894a);
        c12719a.m34896a(this.f33879a.substring(1));
        return c12719a;
    }
}
