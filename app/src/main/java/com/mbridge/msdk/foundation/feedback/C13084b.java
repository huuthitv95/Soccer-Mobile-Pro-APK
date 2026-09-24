package com.mbridge.msdk.foundation.feedback;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.feedback.bean.C13085a;
import com.mbridge.msdk.foundation.same.report.C13148j;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.dialog.MBFeedBackDialog;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.feedback.b */
/* JADX INFO: compiled from: FeedbackManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13084b {

    /* JADX INFO: renamed from: d */
    public static int f35791d = -2;

    /* JADX INFO: renamed from: e */
    public static int f35792e = -2;

    /* JADX INFO: renamed from: f */
    public static volatile boolean f35793f = false;

    /* JADX INFO: renamed from: a */
    private final RelativeLayout.LayoutParams f35794a;

    /* JADX INFO: renamed from: b */
    private final ConcurrentHashMap<String, C13085a> f35795b;

    /* JADX INFO: renamed from: c */
    private C13635g f35796c;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.feedback.b$b */
    /* JADX INFO: compiled from: FeedbackManager.java */
    static class b {

        /* JADX INFO: renamed from: a */
        private static final C13084b f35797a = new C13084b();
    }

    /* JADX INFO: renamed from: b */
    public static C13084b m37036b() {
        return b.f35797a;
    }

    /* JADX INFO: renamed from: c */
    private C13085a m37037c(String str) {
        if (TextUtils.isEmpty(str)) {
            str = C13008c.m36588n().m36533b();
        }
        if (this.f35795b.containsKey(str)) {
            return this.f35795b.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m37045a(String str, Context context, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, InterfaceC13083a interfaceC13083a) {
        if (m37050a()) {
            C13085a c13085aM37052b = m37052b(str);
            if (interfaceC13083a != null) {
                c13085aM37052b.m37078a(new C13085a.g(str, interfaceC13083a));
            }
            FeedBackButton feedBackButtonM37087i = c13085aM37052b.m37087i();
            if (feedBackButtonM37087i != null) {
                if (layoutParams == null) {
                    int iM37876a = C13229v0.m37876a(C13008c.m36588n().m36542d(), 10.0f);
                    this.f35794a.setMargins(iM37876a, iM37876a, iM37876a, iM37876a);
                    layoutParams = this.f35794a;
                }
                ViewGroup viewGroup2 = (ViewGroup) feedBackButtonM37087i.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(feedBackButtonM37087i);
                }
                Activity activityM37038a = m37038a(context);
                if (activityM37038a != null && viewGroup == null) {
                    viewGroup = (ViewGroup) activityM37038a.findViewById(R.id.content);
                }
                if (viewGroup != null) {
                    viewGroup.removeView(feedBackButtonM37087i);
                    viewGroup.addView(feedBackButtonM37087i, layoutParams);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m37054d(String str) {
        try {
            C13085a c13085aM37037c = m37037c(str);
            if (c13085aM37037c != null) {
                c13085aM37037c.m37084f();
            }
            this.f35795b.remove(str);
            f35793f = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private C13084b() {
        this.f35794a = new RelativeLayout.LayoutParams(f35792e, f35791d);
        this.f35795b = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: b */
    public C13085a m37052b(String str) {
        C13085a c13085a;
        if (TextUtils.isEmpty(str)) {
            str = C13008c.m36588n().m36533b();
        }
        if (this.f35795b.containsKey(str)) {
            c13085a = this.f35795b.get(str);
        } else {
            c13085a = new C13085a(str);
            this.f35795b.put(str, c13085a);
        }
        if (c13085a != null) {
            return c13085a;
        }
        C13085a c13085a2 = new C13085a(str);
        this.f35795b.put(str, c13085a2);
        return c13085a2;
    }

    /* JADX INFO: renamed from: b */
    public void m37053b(String str, int i) {
        m37052b(str).m37082c(i);
    }

    /* JADX INFO: renamed from: a */
    public boolean m37050a() {
        C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
        this.f35796c = c13635gM39718d;
        if (c13635gM39718d != null) {
            return false;
        }
        this.f35796c = C13636h.m39706b().m39708a();
        return false;
    }

    /* JADX INFO: renamed from: a */
    public Activity m37038a(Context context) {
        Activity activity;
        Context contextM36546f = C13008c.m36588n().m36546f();
        Activity activity2 = null;
        try {
            Activity activity3 = contextM36546f instanceof Activity ? (Activity) contextM36546f : null;
            try {
                if ((context instanceof Activity) && !((Activity) context).isDestroyed()) {
                    activity3 = (Activity) context;
                }
                WeakReference<Activity> weakReferenceM36525a = C13008c.m36588n().m36525a();
                if (weakReferenceM36525a != null && (activity = weakReferenceM36525a.get()) != null && !activity.isFinishing() && !activity.isDestroyed()) {
                    activity3 = activity;
                }
                if (activity3 == null || activity3.isFinishing() || activity3.isDestroyed()) {
                    return null;
                }
                return activity3;
            } catch (Exception e) {
                e = e;
                activity2 = activity3;
                e.printStackTrace();
                return activity2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m37043a(String str, int i, ViewGroup viewGroup) {
        C13085a c13085aM37052b = m37052b(str);
        if (c13085aM37052b.m37087i() != null) {
            c13085aM37052b.m37083d(i);
            if (i == 0) {
                m37045a(str, C13008c.m36588n().m36542d(), viewGroup, (ViewGroup.LayoutParams) null, (InterfaceC13083a) null);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m37041a(String str, int i, int i2, int i3, float f, float f2, float f3, String str2, String str3, float f4, JSONArray jSONArray) {
        C13085a c13085aM37052b = m37052b(str);
        Context contextM36542d = C13008c.m36588n().m36542d();
        c13085aM37052b.m37076a(C13229v0.m37876a(contextM36542d, f), C13229v0.m37876a(contextM36542d, f2), C13229v0.m37876a(contextM36542d, i), C13229v0.m37876a(contextM36542d, i2), C13229v0.m37876a(contextM36542d, i3), f3, str2, str3, f4, jSONArray);
    }

    /* JADX INFO: renamed from: a */
    public void m37044a(String str, int i, InterfaceC13083a interfaceC13083a) {
        C13085a c13085aM37052b = m37052b(str);
        c13085aM37052b.m37078a(new C13085a.g(str, interfaceC13083a));
        if (i == 1) {
            c13085aM37052b.m37085g();
        } else {
            c13085aM37052b.m37090p();
        }
    }

    /* JADX INFO: renamed from: a */
    public FeedBackButton m37039a(String str) {
        return m37052b(str).m37087i();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0062 A[PHI: r0
  0x0062: PHI (r0v8 com.mbridge.msdk.foundation.feedback.bean.a) = 
  (r0v7 com.mbridge.msdk.foundation.feedback.bean.a)
  (r0v11 com.mbridge.msdk.foundation.feedback.bean.a)
  (r0v14 com.mbridge.msdk.foundation.feedback.bean.a)
 binds: [B:5:0x002d, B:7:0x0044, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public void m37042a(String str, int i, int i2, String str2, String str3) {
        C13085a c13085aM37037c = m37037c(str + "_1");
        if (c13085aM37037c == null) {
            c13085aM37037c = m37037c(str + "_2");
            if (c13085aM37037c == null) {
                c13085aM37037c = m37037c(str + "_3");
                if (c13085aM37037c == null) {
                    c13085aM37037c = m37037c(str + "_4");
                    if (c13085aM37037c == null) {
                        c13085aM37037c = m37052b(str);
                    } else {
                        c13085aM37037c.m37082c(0);
                    }
                } else {
                    c13085aM37037c.m37082c(0);
                }
            } else {
                c13085aM37037c.m37082c(0);
            }
        }
        if (c13085aM37037c != null) {
            CampaignEx campaignExM37086h = c13085aM37037c.m37086h();
            C13148j.m37389a(campaignExM37086h, campaignExM37086h != null ? campaignExM37086h.getCampaignUnitId() : "", c13085aM37037c.m37089k(), c13085aM37037c.m37088j(), !TextUtils.isEmpty(str2) ? str2 : "", i, campaignExM37086h != null ? campaignExM37086h.getAdType() : 0, i2, str3);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m37046a(String str, CampaignEx campaignEx) {
        m37052b(str).m37077a(campaignEx);
    }

    /* JADX INFO: renamed from: a */
    public void m37049a(String str, String str2) {
        m37052b(str).m37081b(str2);
    }

    /* JADX INFO: renamed from: a */
    public void m37048a(String str, FeedBackButton feedBackButton) {
        m37052b(str).m37079a(feedBackButton);
    }

    /* JADX INFO: renamed from: a */
    public void m37047a(String str, InterfaceC13083a interfaceC13083a) {
        C13085a c13085aM37052b = m37052b(str);
        if (interfaceC13083a != null) {
            c13085aM37052b.m37078a(new C13085a.g(str, interfaceC13083a));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m37040a(String str, int i) {
        m37052b(str).m37080b(i);
    }

    /* JADX INFO: renamed from: a */
    public boolean m37051a(String str, Context context, MBFeedBackDialog mBFeedBackDialog) {
        if (mBFeedBackDialog == null) {
            C13219q0.m37818c("", "mbAlertDialog  is null");
            return false;
        }
        return m37035a(context, mBFeedBackDialog);
    }

    /* JADX INFO: renamed from: a */
    private boolean m37035a(Context context, MBFeedBackDialog mBFeedBackDialog) {
        Activity activityM37038a = m37038a(context);
        if (activityM37038a == null || mBFeedBackDialog == null || activityM37038a.isDestroyed()) {
            return false;
        }
        try {
            if (!mBFeedBackDialog.isShowing() && !activityM37038a.isFinishing()) {
                mBFeedBackDialog.show();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
