package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.C12364a;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.Q6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11629Q6 {

    /* JADX INFO: renamed from: a */
    private final C11648R9 f25554a;

    public C11629Q6(C11648R9 globalDataWriter) {
        Intrinsics.checkNotNullParameter(globalDataWriter, "globalDataWriter");
        this.f25554a = globalDataWriter;
    }

    /* JADX INFO: renamed from: a */
    public final void m27291a(JSONObject metaDataJson) {
        Intrinsics.checkNotNullParameter(metaDataJson, "metaDataJson");
        if (metaDataJson.has(C12364a.f31323i)) {
            try {
                Object objRemove = metaDataJson.remove(C12364a.f31323i);
                Intrinsics.checkNotNull(objRemove, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                ArrayList arrayList = (ArrayList) objRemove;
                if (arrayList.isEmpty()) {
                    return;
                }
                Object obj = arrayList.get(0);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                this.f25554a.m27358e((String) obj);
            } catch (ClassCastException e) {
                C12317m4.m32153d().m32155a(e);
                IronLog.INTERNAL.error("got the following error " + e.getMessage());
            }
        }
    }
}
