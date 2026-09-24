package com.mbridge.msdk.config.component.mat;

import com.mbridge.msdk.config.component.base.C12709a;
import com.mbridge.msdk.config.component.common.express.C12717d;
import com.mbridge.msdk.config.component.common.util.C12770c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class MatCpt extends C12709a {

    /* JADX INFO: renamed from: h */
    ArrayList<Map<String, Object>> f34265h;

    /* JADX INFO: renamed from: i */
    C12717d f34266i;

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: b */
    protected void mo34834b(Map<String, Object> map) {
        super.mo34834b(map);
        this.f33808f = "920001";
        Object obj = map.get(C12770c.m35209b("118"));
        if (obj instanceof List) {
            this.f34265h = (ArrayList) obj;
        }
        this.f34266i = new C12717d();
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: d */
    public void mo34836d() {
        super.mo34836d();
        ArrayList<Map<String, Object>> arrayList = this.f34265h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Object objM34892a = null;
        for (Map<String, Object> map : this.f34265h) {
            String strValueOf = String.valueOf(map.get(C12770c.m35209b("142")));
            String strValueOf2 = String.valueOf(map.get(C12770c.m35209b("118")));
            String strValueOf3 = String.valueOf(map.get(C12770c.m35209b("143")));
            Object objM34892a2 = this.f34266i.m34892a(strValueOf, this.f33806d);
            boolean zEquals = false;
            if (objM34892a2 instanceof Integer) {
                if (((Integer) objM34892a2).intValue() == 1) {
                    zEquals = true;
                }
            } else if (objM34892a2 instanceof String) {
                zEquals = String.valueOf(objM34892a2).equals("1");
            }
            if (zEquals) {
                objM34892a = this.f34266i.m34892a(strValueOf2, this.f33806d);
                if (strValueOf3.equals("N")) {
                    break;
                }
            }
        }
        HashMap map2 = new HashMap();
        map2.put(C12770c.m35209b("data"), objM34892a);
        m34829a(m34827a("920002", map2));
    }
}
