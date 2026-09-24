package com.bytedance.sdk.openadsdk.core.p200co.p208lr;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.jbs.p095di.C2270lr;
import com.bytedance.adsdk.ugeno.jbs.p095di.C2271ri;
import com.bytedance.sdk.component.utils.C2729uq;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3175ri extends C2270lr {
    public C3175ri(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.jbs.p095di.C2270lr
    /* JADX INFO: renamed from: aw */
    public void mo7668aw(String str) {
        super.mo7668aw(str);
        if (TextUtils.isEmpty(str) || TextUtils.equals(AbstractJsonLexerKt.NULL, str)) {
            return;
        }
        try {
            String str2 = String.format(C2729uq.m10311ri(this.f5888lr, "tt_comment_num"), Integer.valueOf(Integer.parseInt(str)));
            ((C2271ri) this.f5875fi).setText("(" + str2 + ")");
        } catch (Exception unused) {
        }
    }
}
