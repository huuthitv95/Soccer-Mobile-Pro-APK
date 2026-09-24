package com.unity3d.ironsourceads.internal.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.C11455Gb;
import com.ironsource.C11561M9;
import com.ironsource.C12317m4;
import com.ironsource.C12580w5;
import com.ironsource.EnumC12265j9;
import com.ironsource.EnumC12598x5;
import com.ironsource.InterfaceC12219h;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.C12513v;
import com.ironsource.sdk.utils.Logger;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class InlineStoreActivity extends Activity {

    /* JADX INFO: renamed from: c */
    private static final String f41407c = "InlineStoreActivity";

    /* JADX INFO: renamed from: d */
    private static final int f41408d = 1001;

    /* JADX INFO: renamed from: a */
    private C12513v f41409a;

    /* JADX INFO: renamed from: b */
    private boolean f41410b = false;

    /* JADX INFO: renamed from: com.unity3d.ironsourceads.internal.services.InlineStoreActivity$a */
    static class C14635a {

        /* JADX INFO: renamed from: a */
        static final String f41411a = "inline_store_intent";

        /* JADX INFO: renamed from: b */
        static final String f41412b = "destroy_inline_store";

        private C14635a() {
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ironsourceads.internal.services.InlineStoreActivity$b */
    /* JADX INFO: loaded from: classes9.dex */
    public static class C14636b {

        /* JADX INFO: renamed from: a */
        private final InterfaceC12219h f41413a;

        /* JADX INFO: renamed from: b */
        private Intent f41414b;

        public C14636b(InterfaceC12219h interfaceC12219h) {
            this.f41413a = interfaceC12219h;
        }

        /* JADX INFO: renamed from: a */
        public Intent m43171a(Context context) {
            Intent intentMo31566a = this.f41413a.mo31566a(context);
            intentMo31566a.putExtra("inline_store_intent", this.f41414b);
            return intentMo31566a;
        }

        /* JADX INFO: renamed from: a */
        public C14636b m43172a(Intent intent) {
            this.f41414b = intent;
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m43166a() {
        getWindow().setFlags(1024, 1024);
    }

    /* JADX INFO: renamed from: a */
    private void m43167a(Intent intent) {
        startActivityForResult(intent, 1001);
        C12513v c12513v = this.f41409a;
        if (c12513v != null) {
            c12513v.m33594z();
        }
        m43168a(EnumC12598x5.INLINE_STORE_LAUNCHED, (Map<String, Object>) null);
    }

    /* JADX INFO: renamed from: a */
    private void m43168a(final EnumC12598x5 enumC12598x5, final Map<String, Object> map) {
        new Thread(new Runnable() { // from class: com.unity3d.ironsourceads.internal.services.InlineStoreActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                InlineStoreActivity.m43169a(map, enumC12598x5);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m43169a(Map map, EnumC12598x5 enumC12598x5) {
        try {
            HashMap map2 = map != null ? new HashMap(map) : new HashMap();
            String str = "strategy:" + EnumC12265j9.APP_ACTIVITY.m31870b();
            Object obj = map2.get(IronSourceConstants.EVENTS_EXT1);
            if (!(obj instanceof String) || TextUtils.isEmpty((String) obj)) {
                map2.put(IronSourceConstants.EVENTS_EXT1, str);
            } else {
                map2.put(IronSourceConstants.EVENTS_EXT1, str + "," + obj);
            }
            C11455Gb.m25891U().mo25850q().mo25281a(new C12580w5(enumC12598x5, new JSONObject(map2)));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m43170b() {
        requestWindowFeature(1);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            C12513v c12513v = this.f41409a;
            if (c12513v != null) {
                c12513v.m33552a(i2, this.f41410b);
            }
            Map<String, Object> map = new HashMap<>();
            String str = "resultCode:" + i2;
            if (this.f41410b) {
                str = str + ",destroyCalled:true";
            }
            map.put(IronSourceConstants.EVENTS_EXT1, str);
            m43168a(EnumC12598x5.INLINE_STORE_CLOSED, map);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.m33642i(f41407c, "onCreate()");
        try {
            this.f41409a = (C12513v) C11561M9.m26506b((Context) this).mo26512a().m33428k();
            m43170b();
            m43166a();
            m43167a((Intent) getIntent().getExtras().getParcelable("inline_store_intent"));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            C12513v c12513v = this.f41409a;
            if (c12513v != null) {
                c12513v.m33580j(e.toString());
            }
            m43168a(EnumC12598x5.INLINE_STORE_ACTIVITY_FAILED, (Map<String, Object>) null);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        C12513v c12513v = this.f41409a;
        if (c12513v != null) {
            c12513v.m33567a(true, "inlineStoreClose");
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.hasExtra("destroy_inline_store")) {
            IronLog.INTERNAL.verbose("onNewIntent() - destroy inline store request detected");
            this.f41410b = true;
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        C12513v c12513v = this.f41409a;
        if (c12513v != null) {
            c12513v.m33567a(false, "inlineStoreOpen");
        }
    }
}
