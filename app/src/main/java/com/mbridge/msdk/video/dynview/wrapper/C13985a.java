package com.mbridge.msdk.video.dynview.wrapper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeImageView;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.feedback.InterfaceC13083a;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.same.image.InterfaceC13101c;
import com.mbridge.msdk.foundation.same.report.metrics.C13152a;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13181a0;
import com.mbridge.msdk.foundation.tools.C13188c1;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.video.dynview.C13942c;
import com.mbridge.msdk.video.dynview.energize.C13944a;
import com.mbridge.msdk.video.dynview.error.EnumC13946a;
import com.mbridge.msdk.video.dynview.inter.InterfaceC13947a;
import com.mbridge.msdk.video.dynview.listener.InterfaceC13950c;
import com.mbridge.msdk.video.dynview.listener.InterfaceC13951d;
import com.mbridge.msdk.video.dynview.listener.InterfaceC13952e;
import com.mbridge.msdk.video.dynview.ordercamp.adapter.C13969a;
import com.mbridge.msdk.video.dynview.p292ui.C13975b;
import com.mbridge.msdk.video.dynview.shape.C13973a;
import com.mbridge.msdk.video.dynview.util.C13976a;
import com.mbridge.msdk.video.dynview.util.draw.C13977a;
import com.mbridge.msdk.video.dynview.util.drawable.C13978a;
import com.mbridge.msdk.video.dynview.util.time.C13980b;
import com.mbridge.msdk.video.dynview.util.time.InterfaceC13979a;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.video.module.report.C14074a;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.a */
/* JADX INFO: compiled from: DataEnergizeWrapper.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13985a {

    /* JADX INFO: renamed from: m */
    private static boolean f40123m;

    /* JADX INFO: renamed from: a */
    private C13980b f40124a;

    /* JADX INFO: renamed from: b */
    private Map<String, Bitmap> f40125b;

    /* JADX INFO: renamed from: c */
    private volatile boolean f40126c;

    /* JADX INFO: renamed from: d */
    private String f40127d = "#FFFFFFFF";

    /* JADX INFO: renamed from: e */
    private String f40128e = "#60000000";

    /* JADX INFO: renamed from: f */
    private String f40129f = "#FF5F5F5F";

    /* JADX INFO: renamed from: g */
    private String f40130g = "#90ECECEC";

    /* JADX INFO: renamed from: h */
    private volatile long f40131h = 0;

    /* JADX INFO: renamed from: i */
    private InterfaceC13979a f40132i = null;

    /* JADX INFO: renamed from: j */
    private boolean f40133j = false;

    /* JADX INFO: renamed from: k */
    private int f40134k = 0;

    /* JADX INFO: renamed from: l */
    public InterfaceC13947a f40135l = new c();

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.a$a */
    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    class a implements InterfaceC13979a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TextView f40136a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40137b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ CampaignEx f40138c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Map f40139d;

        a(TextView textView, String str, CampaignEx campaignEx, Map map) {
            this.f40136a = textView;
            this.f40137b = str;
            this.f40138c = campaignEx;
            this.f40139d = map;
        }

        @Override // com.mbridge.msdk.video.dynview.util.time.InterfaceC13979a
        public void onFinish() {
            this.f40138c.setShowType(C13152a.f36131c);
            C13985a.this.m41912b(this.f40139d);
        }

        @Override // com.mbridge.msdk.video.dynview.util.time.InterfaceC13979a
        public void onTick(long j) {
            C13985a.this.f40134k = (int) (j / 1000);
            this.f40136a.setText(C13976a.m41858a(C13985a.this.f40134k, this.f40136a.getContext()));
            C13985a.this.f40131h++;
            if (TextUtils.isEmpty(this.f40137b) || !this.f40137b.equals("1")) {
                return;
            }
            C13157e c13157e = new C13157e();
            c13157e.m37501a("type", "choseFromTwoHeartbeat");
            c13157e.m37501a("xtSecond", "countTimeForReport");
            c13157e.m37501a("autoPlayCountDownTime", "mLeftOverCountTime");
            C14074a.m42193a("2000103", this.f40138c, c13157e);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.a$b */
    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    class b implements InterfaceC13083a {
        b() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34411a() {
            if (C13985a.this.f40124a != null) {
                C13985a.this.f40124a.m41873a();
                C13985a.this.f40133j = true;
            }
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34412a(String str) {
            if (!C13985a.this.f40133j || C13985a.this.f40124a == null) {
                return;
            }
            C13985a.this.f40124a.m41874a(C13985a.this.f40134k * 1000, C13985a.this.f40132i);
            C13985a.this.f40133j = false;
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        public void close() {
            if (!C13985a.this.f40133j || C13985a.this.f40124a == null) {
                return;
            }
            C13985a.this.f40124a.m41874a(C13985a.this.f40134k * 1000, C13985a.this.f40132i);
            C13985a.this.f40133j = false;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.a$c */
    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    class c implements InterfaceC13947a {
        c() {
        }

        @Override // com.mbridge.msdk.video.dynview.inter.InterfaceC13947a
        /* JADX INFO: renamed from: a */
        public void mo41773a() {
            if (!C13985a.this.f40133j || C13985a.this.f40124a == null) {
                return;
            }
            C13985a.this.f40124a.m41874a(C13985a.this.f40134k * 1000, C13985a.this.f40132i);
            C13985a.this.f40133j = false;
        }

        @Override // com.mbridge.msdk.video.dynview.inter.InterfaceC13947a
        /* JADX INFO: renamed from: b */
        public void mo41774b() {
            if (C13985a.this.f40124a != null) {
                C13985a.this.f40124a.m41873a();
                C13985a.this.f40133j = true;
            }
        }

        @Override // com.mbridge.msdk.video.dynview.inter.InterfaceC13947a
        /* JADX INFO: renamed from: c */
        public void mo41775c() {
            if (C13985a.this.f40124a != null) {
                C13985a.this.f40124a.m41873a();
                C13985a.this.f40133j = true;
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.a$d */
    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    class d extends AbstractViewOnClickListenerC14227a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Map f40143b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ List f40144c;

        d(Map map, List list) {
            this.f40143b = map;
            this.f40144c = list;
        }

        @Override // com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a
        /* JADX INFO: renamed from: a */
        protected void mo38475a(View view) {
            if (C13985a.this.f40126c) {
                return;
            }
            C13985a.this.f40126c = true;
            C13985a.this.m41905a(this.f40143b, (List<CampaignEx>) this.f40144c, 0);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.a$e */
    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    class e extends AbstractViewOnClickListenerC14227a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Map f40146b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ List f40147c;

        e(Map map, List list) {
            this.f40146b = map;
            this.f40147c = list;
        }

        @Override // com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a
        /* JADX INFO: renamed from: a */
        protected void mo38475a(View view) {
            if (C13985a.this.f40126c) {
                return;
            }
            C13985a.this.f40126c = true;
            C13985a.this.m41905a(this.f40146b, (List<CampaignEx>) this.f40147c, 1);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.a$f */
    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    class f implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Map f40149a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ List f40150b;

        f(Map map, List list) {
            this.f40149a = map;
            this.f40150b = list;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C13985a.this.m41905a(this.f40149a, (List<CampaignEx>) this.f40150b, i);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.a$g */
    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    /* JADX INFO: loaded from: classes9.dex */
    class g implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Map f40152a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ List f40153b;

        g(Map map, List list) {
            this.f40152a = map;
            this.f40153b = list;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C13985a.this.m41905a(this.f40152a, (List<CampaignEx>) this.f40153b, i);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.a$h */
    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    class h implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Map f40155a;

        h(Map map) {
            this.f40155a = map;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C13985a.this.m41904a(this.f40155a);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.a$i */
    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    class i implements InterfaceC13101c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f40157a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ImageView f40158b;

        /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.a$i$a */
        /* JADX INFO: compiled from: DataEnergizeWrapper.java */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Bitmap f40160a;

            /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.a$i$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: DataEnergizeWrapper.java */
            class RunnableC15566a implements Runnable {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ Bitmap f40162a;

                RunnableC15566a(Bitmap bitmap) {
                    this.f40162a = bitmap;
                }

                @Override // java.lang.Runnable
                public void run() {
                    i.this.f40158b.setImageBitmap(this.f40162a);
                }
            }

            a(Bitmap bitmap) {
                this.f40160a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    i.this.f40158b.post(new RunnableC15566a(C13181a0.m37594a(this.f40160a, 10)));
                } catch (Exception e) {
                    C13219q0.m37816b("DataEnergizeWrapper", e.getMessage());
                }
            }
        }

        i(int i, ImageView imageView) {
            this.f40157a = i;
            this.f40158b = imageView;
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
            try {
                int iM37707a = C13203i0.m37707a(this.f40158b.getContext(), "mbridge_icon_play_bg", "drawable");
                this.f40158b.setBackgroundColor(Color.parseColor(C13985a.this.f40129f));
                this.f40158b.setImageResource(iM37707a);
                this.f40158b.setScaleType(ImageView.ScaleType.CENTER);
            } catch (Exception e) {
                C13219q0.m37813a("DataEnergizeWrapper", e.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                int iM37707a = C13203i0.m37707a(this.f40158b.getContext(), "mbridge_icon_play_bg", "drawable");
                this.f40158b.setBackgroundColor(Color.parseColor(C13985a.this.f40129f));
                this.f40158b.setImageResource(iM37707a);
                this.f40158b.setScaleType(ImageView.ScaleType.CENTER);
                return;
            }
            int i = this.f40157a;
            if (i != 501 && i != 802) {
                this.f40158b.setImageBitmap(bitmap);
            } else {
                C13167a.m37542a().execute(new a(bitmap));
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.a$j */
    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    class j implements InterfaceC13101c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ImageView f40164a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40165b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C13942c f40166c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ View f40167d;

        j(ImageView imageView, String str, C13942c c13942c, View view) {
            this.f40164a = imageView;
            this.f40165b = str;
            this.f40166c = c13942c;
            this.f40167d = view;
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            ImageView imageView;
            if (bitmap == null || bitmap.isRecycled() || (imageView = this.f40164a) == null) {
                return;
            }
            imageView.setImageBitmap(bitmap);
            if (C13985a.this.f40125b != null) {
                C13985a.this.f40125b.put(SameMD5.getMD5(this.f40165b), bitmap);
                C13985a.this.m41897a(this.f40166c, this.f40167d);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.a$k */
    /* JADX INFO: compiled from: DataEnergizeWrapper.java */
    class k extends AbstractViewOnClickListenerC14227a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CampaignEx f40169b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Map f40170c;

        k(CampaignEx campaignEx, Map map) {
            this.f40169b = campaignEx;
            this.f40170c = map;
        }

        @Override // com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a
        /* JADX INFO: renamed from: a */
        protected void mo38475a(View view) {
            if (C13985a.this.f40126c) {
                return;
            }
            C13985a.this.f40126c = true;
            this.f40169b.setShowType(C13152a.f36132d);
            C13985a.this.m41912b(this.f40170c);
        }
    }

    /* JADX INFO: renamed from: a */
    private int m41892a(boolean z, String str) {
        try {
            if (!z) {
                return C13203i0.m37707a(C13008c.m36588n().m36542d(), str, "id");
            }
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return str.hashCode();
        } catch (Exception e2) {
            C13219q0.m37816b("DataEnergizeWrapper", e2.getMessage());
            return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    private Bitmap m41894a() {
        Bitmap bitmapCreateBitmap = null;
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444);
            bitmapCreateBitmap.eraseColor(Color.parseColor(this.f40130g));
            return bitmapCreateBitmap;
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
            return bitmapCreateBitmap;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m41895a(ImageView imageView, String str, int i2) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        C13100b.m37152a(imageView.getContext()).m37155a(str, new i(i2, imageView));
    }

    /* JADX INFO: renamed from: a */
    private void m41896a(ListView listView, C13942c c13942c) {
        if (listView == null || c13942c == null) {
            return;
        }
        try {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) listView.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.height = -1;
            float fM41715k = (c13942c.m41715k() - C13229v0.m37876a(C13008c.m36588n().m36542d(), 720.0f)) / 2.0f;
            int iM37876a = C13229v0.m37876a(C13008c.m36588n().m36542d(), 10.0f);
            int i2 = (int) fM41715k;
            layoutParams.setMargins(iM37876a, i2, iM37876a, i2);
            listView.setLayoutParams(layoutParams);
        } catch (Exception e2) {
            C13219q0.m37816b("DataEnergizeWrapper", e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m41897a(C13942c c13942c, View view) {
        Map<String, Bitmap> map = this.f40125b;
        if (map == null || map.size() <= 1) {
            return;
        }
        new C13975b().m41852a(this.f40125b, c13942c, view);
    }

    /* JADX INFO: renamed from: a */
    private void m41901a(String str, Context context, View view, int i2, Map map, CampaignEx campaignEx) {
        CampaignEx campaignEx2;
        String strM37645a = C13188c1.m37645a(str, "cltp");
        String strM37645a2 = C13188c1.m37645a(str, "xt");
        long j2 = !TextUtils.isEmpty(strM37645a) ? Long.parseLong(strM37645a) : 0L;
        if (j2 != 0) {
            if (map != null && map.containsKey("is_dy_success")) {
                f40123m = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            TextView textView = (TextView) view.findViewById(m41892a(f40123m, "mbridge_choice_one_countdown_tv"));
            if (textView != null) {
                textView.setTextSize(11.0f);
                textView.setTextColor(Color.parseColor(this.f40127d));
                String str2 = this.f40128e;
                C13978a.m41870a(textView, 1, 12, str2, str2);
                textView.setVisibility(0);
                textView.setOnClickListener(new k(campaignEx, map));
                campaignEx2 = campaignEx;
                this.f40132i = new a(textView, strM37645a2, campaignEx2, map);
                C13980b c13980bM41872a = new C13980b().m41875b(j2 * 1000).m41871a(1000L).m41872a(this.f40132i);
                this.f40124a = c13980bM41872a;
                c13980bM41872a.m41877c();
            } else {
                campaignEx2 = campaignEx;
            }
            ImageView imageView = (ImageView) view.findViewById(m41892a(f40123m, "mbridge_iv_link"));
            if (campaignEx2 == null) {
                return;
            }
            if (campaignEx2.getAdchoice() != null) {
                campaignEx2.getAdchoice().m36759g("");
            }
            C13229v0.m37892a(4, imageView, campaignEx2, C13008c.m36588n().m36542d(), false, new b());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m41902a(String str, ImageView imageView) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        m41895a(imageView, str, -1);
    }

    /* JADX INFO: renamed from: a */
    private void m41903a(String str, ImageView imageView, C13942c c13942c, View view) {
        C13100b.m37152a(imageView.getContext()).m37155a(str, new j(imageView, str, c13942c, view));
        try {
            Bitmap bitmapM41894a = m41894a();
            if (bitmapM41894a == null || bitmapM41894a.isRecycled()) {
                return;
            }
            m41910b(c13942c, view);
        } catch (Exception e2) {
            C13219q0.m37816b("DataEnergizeWrapper", e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m41904a(Map map) {
        if (map != null) {
            try {
                if (map.containsKey("order_view_callback") && (map.get("order_view_callback") instanceof InterfaceC13950c)) {
                    ((InterfaceC13950c) map.get("order_view_callback")).close();
                    m41909b();
                }
            } catch (Exception e2) {
                C13219q0.m37816b("DataEnergizeWrapper", e2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m41905a(Map map, List<CampaignEx> list, int i2) {
        if (map == null || list == null || list.size() <= 1) {
            return;
        }
        if (!map.containsKey("choice_one_callback") || !(map.get("choice_one_callback") instanceof InterfaceC13951d)) {
            if (map.containsKey("order_view_callback") && (map.get("order_view_callback") instanceof InterfaceC13950c)) {
                InterfaceC13950c interfaceC13950c = (InterfaceC13950c) map.get("order_view_callback");
                if (interfaceC13950c != null) {
                    interfaceC13950c.mo41778a(list.get(i2), i2);
                }
                m41909b();
                return;
            }
            return;
        }
        InterfaceC13951d interfaceC13951d = (InterfaceC13951d) map.get("choice_one_callback");
        if (interfaceC13951d != null) {
            interfaceC13951d.mo39339a(list.get(i2));
            try {
                CampaignEx campaignEx = list.get(i2);
                C13157e c13157e = new C13157e();
                c13157e.m37501a("click", "0");
                c13157e.m37501a("time", Long.valueOf(this.f40131h));
                c13157e.m37501a("choose_cid", campaignEx.getId());
                c13157e.m37501a(C11744X3.i.f26338L, Integer.valueOf(i2));
                c13157e.m37501a("type", "choseFromTwoSelect");
                C14074a.m42193a("2000103", campaignEx, c13157e);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
        m41909b();
    }

    /* JADX INFO: renamed from: b */
    private void m41909b() {
        C13977a.m41865a().m41868b();
        C13980b c13980b = this.f40124a;
        if (c13980b != null) {
            c13980b.m41873a();
            this.f40124a = null;
        }
        C13944a.m41754a().f39983a = null;
        if (this.f40135l != null) {
            this.f40135l = null;
        }
        Map<String, Bitmap> map = this.f40125b;
        if (map != null) {
            if (map.entrySet() != null) {
                try {
                    Iterator<Map.Entry<String, Bitmap>> it = this.f40125b.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, Bitmap> next = it.next();
                        if (next != null && next.getValue() != null && !next.getValue().isRecycled()) {
                            next.getValue().recycle();
                        }
                        it.remove();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            this.f40125b.clear();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m41910b(C13942c c13942c, View view) {
        C13973a.b bVarM41819a = C13973a.m41819a();
        bVarM41819a.orientation(c13942c.m41712h()).mo41836a(true);
        if (c13942c.m41712h() != 2 || c13942c.m41717m() > c13942c.m41715k()) {
            bVarM41819a.m41837b(c13942c.m41717m()).mo41833a(c13942c.m41715k());
        } else {
            bVarM41819a.m41837b(c13942c.m41715k()).mo41833a(c13942c.m41717m());
        }
        if (view.getBackground() == null) {
            view.setBackground(bVarM41819a.build());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m41912b(Map map) {
        if (map != null) {
            try {
                if (map.containsKey("choice_one_callback") && (map.get("choice_one_callback") instanceof InterfaceC13951d)) {
                    ((InterfaceC13951d) map.get("choice_one_callback")).mo39338a();
                    m41909b();
                }
            } catch (Exception e2) {
                C13219q0.m37816b("DataEnergizeWrapper", e2.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m41920a(C13942c c13942c, View view, InterfaceC13952e interfaceC13952e) {
        if (interfaceC13952e == null) {
            return;
        }
        if (c13942c == null) {
            interfaceC13952e.mo41780a(EnumC13946a.NOT_FOUND_VIEWOPTION);
            return;
        }
        try {
            ImageView imageView = (ImageView) view.findViewById(C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_iv_adbanner_bg", "id"));
            if (imageView != null) {
                imageView.setBackgroundColor(Color.parseColor(this.f40130g));
            }
            ImageView imageView2 = (ImageView) view.findViewById(C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_iv_adbanner", "id"));
            if (imageView2 != null) {
                imageView2.setBackgroundColor(Color.parseColor(this.f40130g));
            }
            interfaceC13952e.mo41779a(view, new ArrayList());
        } catch (Exception e2) {
            C13219q0.m37813a("DataEnergizeWrapper", e2.getMessage());
            interfaceC13952e.mo41780a(EnumC13946a.NOT_FOUND_VIEWOPTION);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:54:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:56:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:58:0x0206  */
    /* JADX WARN: Code duplicated, block: B:59:0x020e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0215  */
    /* JADX WARN: Code duplicated, block: B:63:0x021f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0239  */
    /* JADX WARN: Code duplicated, block: B:67:0x023f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0249  */
    /* JADX WARN: Code duplicated, block: B:70:0x0288  */
    /* JADX WARN: Code duplicated, block: B:71:0x0295  */
    /* JADX WARN: Code duplicated, block: B:72:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:75:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:78:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:80:0x02be  */
    /* JADX WARN: Code duplicated, block: B:83:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:85:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:86:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x0303  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public void m41921a(C13942c c13942c, View view, Map map, InterfaceC13952e interfaceC13952e) {
        CampaignEx campaignEx;
        CampaignEx campaignEx2;
        RoundImageView roundImageView;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        ImageView imageView5;
        int i2;
        int i3;
        ImageView imageView6;
        ImageView imageView7;
        if (this.f40125b == null) {
            this.f40125b = new HashMap();
        }
        List<CampaignEx> listM41706b = c13942c.m41706b();
        if (view == null) {
            interfaceC13952e.mo41780a(EnumC13946a.NOT_FOUND_ROOTVIEW);
            return;
        }
        Context context = view.getContext();
        if (context == null) {
            interfaceC13952e.mo41780a(EnumC13946a.NOT_FOUND_CONTEXT);
            return;
        }
        if (listM41706b == null || listM41706b.size() <= 1) {
            campaignEx = null;
            campaignEx2 = null;
        } else {
            campaignEx = listM41706b.get(0);
            campaignEx.setShowIndex(C13152a.f36129a);
            campaignEx2 = listM41706b.get(1);
            campaignEx2.setShowIndex(C13152a.f36130b);
        }
        if (campaignEx == null && interfaceC13952e != null) {
            interfaceC13952e.mo41780a(EnumC13946a.CAMPAIGNEX_IS_NULL);
            return;
        }
        if (campaignEx2 == null && interfaceC13952e != null) {
            interfaceC13952e.mo41780a(EnumC13946a.CAMPAIGNEX_IS_NULL);
            return;
        }
        if (map != null && map.containsKey("is_dy_success")) {
            f40123m = ((Boolean) map.get("is_dy_success")).booleanValue();
        }
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(m41892a(f40123m, "mbridge_top_item_rl"));
        MBridgeImageView mBridgeImageView = (MBridgeImageView) view.findViewById(m41892a(f40123m, "mbridge_top_iv"));
        MBRotationView mBRotationView = (MBRotationView) view.findViewById(m41892a(f40123m, "mbridge_top_ration"));
        TextView textView = (TextView) view.findViewById(m41892a(f40123m, "mbridge_top_title_tv"));
        RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(m41892a(f40123m, "mbridge_bottom_item_rl"));
        MBRotationView mBRotationView2 = (MBRotationView) view.findViewById(m41892a(f40123m, "mbridge_bottom_ration"));
        MBridgeImageView mBridgeImageView2 = (MBridgeImageView) view.findViewById(m41892a(f40123m, "mbridge_bottom_iv"));
        boolean z = f40123m;
        CampaignEx campaignEx3 = campaignEx;
        if (z) {
            ImageView imageView8 = (MBCusRoundImageView) view.findViewById(m41892a(z, "mbridge_top_icon_iv"));
            imageView3 = (MBCusRoundImageView) view.findViewById(m41892a(f40123m, "mbridge_bottom_icon_iv"));
            imageView = null;
            imageView2 = imageView8;
            roundImageView = null;
        } else {
            roundImageView = (RoundImageView) view.findViewById(m41892a(z, "mbridge_top_icon_iv"));
            imageView = (RoundImageView) view.findViewById(m41892a(f40123m, "mbridge_bottom_icon_iv"));
            imageView2 = null;
            imageView3 = null;
        }
        CampaignEx campaignEx4 = campaignEx2;
        TextView textView2 = (TextView) view.findViewById(m41892a(f40123m, "mbridge_bottom_title_tv"));
        ImageView imageView9 = imageView;
        ImageView imageView10 = (ImageView) view.findViewById(m41892a(f40123m, "mbridge_reward_choice_one_like_iv"));
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new d(map, listM41706b));
        }
        if (mBridgeImageView != null) {
            imageView4 = imageView10;
            imageView5 = imageView9;
            mBridgeImageView.setCustomBorder(20, 20, 0, 0, 10, ViewCompat.MEASURED_STATE_MASK);
            m41903a(campaignEx3.getImageUrl(), mBridgeImageView, c13942c, view);
            if (mBRotationView != null) {
                if (!campaignEx3.getCanStart2C1Anim()) {
                    i2 = 0;
                    mBRotationView.setWidthRatio(1.0f);
                    mBRotationView.setHeightRatio(1.0f);
                    mBRotationView.setAutoscroll(false);
                } else if (TextUtils.isEmpty(campaignEx3.getIconUrl())) {
                    mBRotationView.setWidthRatio(1.0f);
                    mBRotationView.setHeightRatio(1.0f);
                    i2 = 0;
                    mBRotationView.setAutoscroll(false);
                } else {
                    ImageView imageView11 = new ImageView(c13942c.m41707c());
                    imageView11.setLayoutParams(new FrameLayout.LayoutParams(-1, C13229v0.m37876a(c13942c.m41707c(), 200.0f)));
                    imageView11.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    mBRotationView.addView(imageView11);
                    m41902a(campaignEx3.getIconUrl(), imageView11);
                    mBRotationView.setWidthRatio(0.45f);
                    mBRotationView.setHeightRatio(0.9f);
                    mBRotationView.setAutoscroll(true);
                }
            }
            if (roundImageView != null) {
                roundImageView.setType(i2);
                m41902a(campaignEx3.getIconUrl(), roundImageView);
            }
            if (imageView2 != null) {
                m41902a(campaignEx3.getIconUrl(), imageView2);
            }
            if (textView != null) {
                if (TextUtils.isEmpty(campaignEx3.getAppName())) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(campaignEx3.getAppName());
                }
            }
            if (relativeLayout2 != null) {
                relativeLayout2.setOnClickListener(new e(map, listM41706b));
            }
            if (mBridgeImageView2 != null) {
                mBridgeImageView2.setCustomBorder(20, 20, 0, 0, 10, ViewCompat.MEASURED_STATE_MASK);
                m41903a(campaignEx4.getImageUrl(), mBridgeImageView2, c13942c, view);
                if (mBRotationView2 != null) {
                    i3 = 0;
                } else if (campaignEx4.getCanStart2C1Anim()) {
                    i3 = 0;
                    mBRotationView2.setWidthRatio(1.0f);
                    mBRotationView2.setHeightRatio(1.0f);
                    mBRotationView2.setAutoscroll(false);
                } else if (TextUtils.isEmpty(campaignEx4.getIconUrl())) {
                    mBRotationView2.setWidthRatio(1.0f);
                    mBRotationView2.setHeightRatio(1.0f);
                    i3 = 0;
                    mBRotationView2.setAutoscroll(false);
                } else {
                    ImageView imageView12 = new ImageView(c13942c.m41707c());
                    imageView12.setLayoutParams(new FrameLayout.LayoutParams(-1, C13229v0.m37876a(c13942c.m41707c(), 200.0f)));
                    imageView12.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    mBRotationView2.addView(imageView12);
                    m41902a(campaignEx4.getIconUrl(), imageView12);
                    mBRotationView2.setWidthRatio(0.45f);
                    mBRotationView2.setHeightRatio(0.9f);
                    mBRotationView2.setAutoscroll(true);
                    i3 = 0;
                }
            } else {
                i3 = 0;
            }
            if (imageView5 != 0) {
                imageView5.setType(i3);
                m41902a(campaignEx4.getIconUrl(), imageView5);
            }
            imageView6 = imageView3;
            if (imageView6 != null) {
                m41902a(campaignEx4.getIconUrl(), imageView6);
            }
            if (textView2 != null) {
                textView2.setText(campaignEx4.getAppName());
            }
            m41901a(campaignEx3.getCMPTEntryUrl(), context, view, c13942c.m41712h(), map, campaignEx3);
            imageView7 = imageView4;
            if (imageView7 != null) {
                if (c13942c.m41712h() == 1) {
                    imageView7.setImageResource(C13203i0.m37707a(context.getApplicationContext(), C13976a.m41859a(context, 1), "drawable"));
                } else {
                    imageView7.setImageResource(C13203i0.m37707a(context.getApplicationContext(), C13976a.m41859a(context, 2), "drawable"));
                }
            }
            if (interfaceC13952e != null) {
                interfaceC13952e.mo41779a(view, null);
            }
        }
        imageView4 = imageView10;
        imageView5 = imageView9;
        i2 = 0;
        if (roundImageView != null) {
            roundImageView.setType(i2);
            m41902a(campaignEx3.getIconUrl(), roundImageView);
        }
        if (imageView2 != null) {
            m41902a(campaignEx3.getIconUrl(), imageView2);
        }
        if (textView != null) {
            if (TextUtils.isEmpty(campaignEx3.getAppName())) {
                textView.setText(campaignEx3.getAppName());
            } else {
                textView.setVisibility(8);
            }
        }
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(new e(map, listM41706b));
        }
        if (mBridgeImageView2 != null) {
            mBridgeImageView2.setCustomBorder(20, 20, 0, 0, 10, ViewCompat.MEASURED_STATE_MASK);
            m41903a(campaignEx4.getImageUrl(), mBridgeImageView2, c13942c, view);
            if (mBRotationView2 != null) {
                i3 = 0;
            } else if (campaignEx4.getCanStart2C1Anim()) {
                i3 = 0;
                mBRotationView2.setWidthRatio(1.0f);
                mBRotationView2.setHeightRatio(1.0f);
                mBRotationView2.setAutoscroll(false);
            } else if (TextUtils.isEmpty(campaignEx4.getIconUrl())) {
                ImageView imageView13 = new ImageView(c13942c.m41707c());
                imageView13.setLayoutParams(new FrameLayout.LayoutParams(-1, C13229v0.m37876a(c13942c.m41707c(), 200.0f)));
                imageView13.setScaleType(ImageView.ScaleType.CENTER_CROP);
                mBRotationView2.addView(imageView13);
                m41902a(campaignEx4.getIconUrl(), imageView13);
                mBRotationView2.setWidthRatio(0.45f);
                mBRotationView2.setHeightRatio(0.9f);
                mBRotationView2.setAutoscroll(true);
                i3 = 0;
            } else {
                mBRotationView2.setWidthRatio(1.0f);
                mBRotationView2.setHeightRatio(1.0f);
                i3 = 0;
                mBRotationView2.setAutoscroll(false);
            }
        } else {
            i3 = 0;
        }
        if (imageView5 != 0) {
            imageView5.setType(i3);
            m41902a(campaignEx4.getIconUrl(), imageView5);
        }
        imageView6 = imageView3;
        if (imageView6 != null) {
            m41902a(campaignEx4.getIconUrl(), imageView6);
        }
        if (textView2 != null) {
            textView2.setText(campaignEx4.getAppName());
        }
        m41901a(campaignEx3.getCMPTEntryUrl(), context, view, c13942c.m41712h(), map, campaignEx3);
        imageView7 = imageView4;
        if (imageView7 != null) {
            if (c13942c.m41712h() == 1) {
                imageView7.setImageResource(C13203i0.m37707a(context.getApplicationContext(), C13976a.m41859a(context, 1), "drawable"));
            } else {
                imageView7.setImageResource(C13203i0.m37707a(context.getApplicationContext(), C13976a.m41859a(context, 2), "drawable"));
            }
        }
        if (interfaceC13952e != null) {
            interfaceC13952e.mo41779a(view, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m41922b(C13942c c13942c, View view, Map map, InterfaceC13952e interfaceC13952e) {
        if (interfaceC13952e == null) {
            return;
        }
        if (c13942c == null) {
            interfaceC13952e.mo41780a(EnumC13946a.NOT_FOUND_VIEWOPTION);
            return;
        }
        if (map != null && map.containsKey("is_dy_success")) {
            f40123m = ((Boolean) map.get("is_dy_success")).booleanValue();
        }
        boolean z = f40123m;
        LinearLayout linearLayout = z ? (LinearLayout) view.findViewById(m41892a(z, "mbridge_reward_heat_mllv")) : null;
        ImageView imageView = (ImageView) view.findViewById(m41892a(f40123m, "mbridge_reward_icon_riv"));
        TextView textView = (TextView) view.findViewById(m41892a(f40123m, "mbridge_reward_title_tv"));
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(m41892a(f40123m, "mbridge_reward_stars_mllv"));
        TextView textView2 = (TextView) view.findViewById(m41892a(f40123m, "mbridge_reward_click_tv"));
        ImageView imageView2 = (ImageView) view.findViewById(m41892a(f40123m, "mbridge_videoview_bg"));
        TextView textView3 = (TextView) view.findViewById(m41892a(f40123m, "mbridge_reward_desc_tv"));
        View view2 = (RelativeLayout) view.findViewById(m41892a(f40123m, "mbridge_reward_bottom_layout"));
        List<View> arrayList = new ArrayList<>();
        List<CampaignEx> listM41706b = c13942c.m41706b();
        if (listM41706b == null || listM41706b.size() <= 0) {
            interfaceC13952e.mo41780a(EnumC13946a.CAMPAIGNEX_IS_NULL);
            return;
        }
        CampaignEx campaignEx = listM41706b.get(0);
        if (campaignEx == null) {
            interfaceC13952e.mo41780a(EnumC13946a.CAMPAIGNEX_IS_NULL);
            return;
        }
        if (imageView != null) {
            if (!f40123m) {
                ((RoundImageView) imageView).setBorderRadius(10);
            } else if (imageView instanceof MBCusRoundImageView) {
                ((MBCusRoundImageView) imageView).setCustomBorder(30, 30, 30, 30, 10, -1);
            }
            m41902a(campaignEx.getIconUrl(), imageView);
        }
        if (textView != null) {
            textView.setText(campaignEx.getAppName());
        }
        if (textView3 != null) {
            textView3.setText(campaignEx.getAppDesc());
        }
        if (linearLayout2 != null) {
            double rating = campaignEx.getRating();
            if (rating <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                rating = 5.0d;
            }
            if (f40123m) {
                if (linearLayout2 instanceof MBStarLevelLayoutView) {
                    MBStarLevelLayoutView mBStarLevelLayoutView = (MBStarLevelLayoutView) linearLayout2;
                    mBStarLevelLayoutView.setRating((int) rating);
                    mBStarLevelLayoutView.setOrientation(0);
                }
                if (linearLayout instanceof MBHeatLevelLayoutView) {
                    ((MBHeatLevelLayoutView) linearLayout).setHeatCount(campaignEx.getNumberRating());
                }
            } else {
                ((MBridgeLevelLayoutView) linearLayout2).setRatingAndUser(rating, campaignEx.getNumberRating());
            }
        }
        if (textView2 != null) {
            textView2.setText(campaignEx.getAdCall());
        }
        int iM41716l = c13942c.m41716l();
        if (iM41716l == 102 || iM41716l == 202 || iM41716l == 302) {
            if (textView2 != null) {
                arrayList.add(textView2);
            }
        } else if (iM41716l == 802) {
            if (imageView != null) {
                arrayList.add(imageView);
            }
            if (textView2 != null) {
                arrayList.add(textView2);
            }
            m41895a(imageView2, campaignEx.getImageUrl(), iM41716l);
        } else if (iM41716l != 902) {
            if (iM41716l != 904) {
                if (iM41716l == 5002010) {
                    if (c13942c.m41720p() && view2 != null && view2.getVisibility() == 0) {
                        arrayList.add(view2);
                    } else {
                        if (imageView != null) {
                            arrayList.add(imageView);
                        }
                        if (textView2 != null) {
                            arrayList.add(textView2);
                        }
                    }
                }
            } else if (c13942c.m41720p()) {
                arrayList.add(view);
            }
        } else if (TextUtils.isEmpty(c13942c.m41718n()) || !c13942c.m41718n().equals("dsp") || !TextUtils.isEmpty(campaignEx.getClickURL())) {
            arrayList.add(view);
        }
        interfaceC13952e.mo41779a(view, arrayList);
    }

    /* JADX INFO: renamed from: c */
    public void m41923c(C13942c c13942c, View view, Map map, InterfaceC13952e interfaceC13952e) {
        try {
            if (this.f40125b == null) {
                this.f40125b = new HashMap();
            }
            List<CampaignEx> listM41706b = c13942c.m41706b();
            if (view.getContext() == null) {
                interfaceC13952e.mo41780a(EnumC13946a.NOT_FOUND_CONTEXT);
                return;
            }
            if (map != null && map.containsKey("is_dy_success")) {
                f40123m = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            for (CampaignEx campaignEx : listM41706b) {
                if (campaignEx != null) {
                    campaignEx.setECTemplateRenderSucc(f40123m);
                }
            }
            ListView listView = (ListView) view.findViewById(m41892a(f40123m, "mbridge_order_view_lv"));
            GridView gridView = (GridView) view.findViewById(m41892a(f40123m, "mbridge_order_view_h_lv"));
            ImageView imageView = (ImageView) view.findViewById(m41892a(f40123m, "mbridge_order_view_iv_close"));
            C13969a c13969a = new C13969a(listM41706b);
            if (c13942c.m41712h() == 1) {
                if (listView != null) {
                    m41896a(listView, c13942c);
                    listView.setAdapter((ListAdapter) c13969a);
                    listView.setOnItemClickListener(new f(map, listM41706b));
                }
            } else if (gridView != null) {
                int iM41717m = (int) c13942c.m41717m();
                int size = iM41717m / listM41706b.size();
                int i2 = size / 9;
                int i3 = i2 / 2;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) gridView.getLayoutParams();
                layoutParams.width = iM41717m - (i2 * 2);
                gridView.setLayoutParams(layoutParams);
                gridView.setColumnWidth((size - i2) - (i3 / 2));
                gridView.setHorizontalSpacing(i3);
                gridView.setStretchMode(0);
                gridView.setNumColumns(listM41706b.size());
                gridView.setAdapter((ListAdapter) c13969a);
                gridView.setOnItemClickListener(new g(map, listM41706b));
            }
            if (imageView != null) {
                imageView.setOnClickListener(new h(map));
            }
            if (interfaceC13952e != null) {
                interfaceC13952e.mo41779a(view, null);
            }
        } catch (Exception unused) {
            if (interfaceC13952e != null) {
                interfaceC13952e.mo41780a(EnumC13946a.NOT_FOUND_VIEWOPTION);
            }
        }
    }
}
