package com.mbridge.msdk.dycreator.binding;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.dycreator.baseview.MBApkInfoView;
import com.mbridge.msdk.dycreator.baseview.MBFeedBack;
import com.mbridge.msdk.dycreator.baseview.MBLogoTextView;
import com.mbridge.msdk.dycreator.baseview.MBSplashClickView;
import com.mbridge.msdk.dycreator.baseview.MBSplashImageBgView;
import com.mbridge.msdk.dycreator.baseview.MBSplashPortView;
import com.mbridge.msdk.dycreator.baseview.MBSplashShakeView;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bridge.MBSplashData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.subjectfactory.C12977a;
import com.mbridge.msdk.dycreator.utils.C12981d;
import com.mbridge.msdk.dycreator.viewdata.base.InterfaceC12986a;
import com.mbridge.msdk.dycreator.viewmodel.BaseViewModel;
import com.mbridge.msdk.dycreator.viewobserver.C12990c;
import com.mbridge.msdk.dycreator.viewobserver.C12991d;
import com.mbridge.msdk.dycreator.viewobserver.C12993f;
import com.mbridge.msdk.dycreator.viewobserver.C12995h;
import com.mbridge.msdk.dycreator.viewobserver.InterfaceC12989b;
import com.mbridge.msdk.dycreator.viewobserver.InterfaceC12992e;
import com.mbridge.msdk.dycreator.viewobserver.InterfaceC12994g;
import com.mbridge.msdk.dycreator.viewobserver.InterfaceC12996i;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.feedback.C13084b;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.same.image.InterfaceC13101c;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13217p0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.shake.AbstractC13648b;
import com.mbridge.msdk.shake.C13647a;

/* JADX INFO: renamed from: com.mbridge.msdk.dycreator.binding.b */
/* JADX INFO: compiled from: MBDataBinding.java */
/* JADX INFO: loaded from: classes5.dex */
public final class C12959b {

    /* JADX INFO: renamed from: g */
    private static volatile C12959b f35188g;

    /* JADX INFO: renamed from: a */
    private C12991d f35189a = (C12991d) C12977a.m36380a().m36381a(C12977a.b.VIEW_OBSERVER);

    /* JADX INFO: renamed from: b */
    private C12990c f35190b = (C12990c) C12977a.m36380a().m36381a(C12977a.b.CLICK_OBSERVER);

    /* JADX INFO: renamed from: c */
    private C12993f f35191c = (C12993f) C12977a.m36380a().m36381a(C12977a.b.EFFECT_OBSERVER);

    /* JADX INFO: renamed from: d */
    private C12995h f35192d = (C12995h) C12977a.m36380a().m36381a(C12977a.b.REPORT_OBSERVER);

    /* JADX INFO: renamed from: e */
    private BaseViewModel f35193e;

    /* JADX INFO: renamed from: f */
    private AbstractC13648b f35194f;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.binding.b$a */
    /* JADX INFO: compiled from: MBDataBinding.java */
    class a implements InterfaceC12994g {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f35195a;

        a(View view) {
            this.f35195a = view;
        }

        @Override // com.mbridge.msdk.dycreator.viewobserver.InterfaceC12994g
        /* JADX INFO: renamed from: a */
        public void mo36320a(Object obj) {
            try {
                KeyEvent.Callback callback = this.f35195a;
                if (callback instanceof InterBase) {
                    C12959b.this.m36310b((InterBase) callback, obj);
                }
            } catch (Exception e) {
                C13219q0.m37816b("MBDataBinding", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.binding.b$b */
    /* JADX INFO: compiled from: MBDataBinding.java */
    class b implements InterfaceC12992e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f35197a;

        b(View view) {
            this.f35197a = view;
        }

        @Override // com.mbridge.msdk.dycreator.viewobserver.InterfaceC12992e
        /* JADX INFO: renamed from: a */
        public void mo36321a(Object obj) {
            try {
                KeyEvent.Callback callback = this.f35197a;
                if (callback instanceof InterBase) {
                    C12959b.this.m36302a((InterBase) callback, obj);
                }
            } catch (Exception e) {
                C13219q0.m37816b("MBDataBinding", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.binding.b$c */
    /* JADX INFO: compiled from: MBDataBinding.java */
    class c implements InterfaceC12996i {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f35199a;

        c(View view) {
            this.f35199a = view;
        }

        @Override // com.mbridge.msdk.dycreator.viewobserver.InterfaceC12996i
        /* JADX INFO: renamed from: a */
        public void mo36322a(Object obj) {
            try {
                KeyEvent.Callback callback = this.f35199a;
                if (callback instanceof InterBase) {
                    C12959b.this.m36312c((InterBase) callback, obj);
                }
            } catch (Exception e) {
                C13219q0.m37816b("MBDataBinding", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.binding.b$d */
    /* JADX INFO: compiled from: MBDataBinding.java */
    class d implements InterfaceC12989b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f35201a;

        d(View view) {
            this.f35201a = view;
        }

        @Override // com.mbridge.msdk.dycreator.viewobserver.InterfaceC12989b
        /* JADX INFO: renamed from: a */
        public void mo36323a(Object obj) {
            if (obj == null) {
                return;
            }
            try {
                if (C12981d.m36408a(this.f35201a, (InterfaceC12986a) obj)) {
                    C12959b.this.m36298a(this.f35201a, obj);
                }
            } catch (Exception e) {
                C13219q0.m37816b("MBDataBinding", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.binding.b$e */
    /* JADX INFO: compiled from: MBDataBinding.java */
    class e implements DyCountDownListenerWrapper {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f35203a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f35204b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f35205c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ View f35206d;

        e(boolean z, String str, String str2, View view) {
            this.f35203a = z;
            this.f35204b = str;
            this.f35205c = str2;
            this.f35206d = view;
        }

        @Override // com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper
        public void getCountDownValue(int i) {
            if (i != 0) {
                ((TextView) this.f35206d).setText(C12981d.m36406a(this.f35203a, i, this.f35204b, this.f35205c));
            } else {
                SplashResData splashResData = new SplashResData();
                splashResData.seteAction(EAction.CLOSE);
                EventBus.getDefault().post(splashResData);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.binding.b$f */
    /* JADX INFO: compiled from: MBDataBinding.java */
    class f implements InterfaceC13101c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC12986a f35208a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f35209b;

        f(InterfaceC12986a interfaceC12986a, View view) {
            this.f35208a = interfaceC12986a;
            this.f35209b = view;
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
            View view = this.f35209b;
            if (view != null) {
                ((ImageView) view).setBackgroundColor(-7829368);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap != null) {
                try {
                    if (!bitmap.isRecycled()) {
                        boolean z = bitmap.getWidth() > bitmap.getHeight();
                        if ((this.f35208a.getEffectData().getOrientation() == 1 ? this.f35209b.getResources().getConfiguration().orientation : this.f35208a.getEffectData().getOrientation()) == 1) {
                            if (z) {
                                View view = this.f35209b;
                                if (view instanceof MBSplashPortView) {
                                    if (view.getParent() != null) {
                                        ((ViewGroup) this.f35209b.getParent()).setVisibility(8);
                                        return;
                                    }
                                    return;
                                } else if (view instanceof MBSplashImageBgView) {
                                    view.setVisibility(0);
                                    Bitmap bitmapM37809a = C13217p0.m37809a(bitmap);
                                    ((MBSplashImageBgView) this.f35209b).setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    ((MBSplashImageBgView) this.f35209b).setImageBitmap(bitmapM37809a);
                                    return;
                                }
                            } else {
                                View view2 = this.f35209b;
                                if (view2 instanceof MBSplashPortView) {
                                    view2.setVisibility(0);
                                    ((MBSplashPortView) this.f35209b).setScaleType(ImageView.ScaleType.FIT_CENTER);
                                    ((MBSplashPortView) this.f35209b).setImageBitmap(bitmap);
                                    return;
                                } else if (view2 instanceof MBSplashImageBgView) {
                                    view2.setVisibility(8);
                                    return;
                                } else if (view2 instanceof InterBase) {
                                    String effectDes = ((InterBase) view2).getEffectDes();
                                    ViewGroup viewGroup = (ViewGroup) this.f35209b.getParent();
                                    if (viewGroup != null) {
                                        C12981d.m36407a(effectDes, viewGroup, true);
                                    }
                                }
                            }
                        } else if (z) {
                            View view3 = this.f35209b;
                            if (view3 instanceof MBSplashPortView) {
                                view3.setVisibility(0);
                                ((MBSplashPortView) this.f35209b).setScaleType(ImageView.ScaleType.FIT_XY);
                                ((ImageView) this.f35209b).setImageBitmap(bitmap);
                                return;
                            } else if (view3 instanceof MBSplashImageBgView) {
                                view3.setVisibility(8);
                                ((MBSplashImageBgView) this.f35209b).setImageBitmap(C13217p0.m37809a(bitmap));
                                return;
                            } else if (view3 instanceof InterBase) {
                                String effectDes2 = ((InterBase) view3).getEffectDes();
                                ViewGroup viewGroup2 = (ViewGroup) this.f35209b.getParent();
                                if (viewGroup2 != null) {
                                    C12981d.m36407a(effectDes2, viewGroup2, true);
                                }
                            }
                        } else {
                            View view4 = this.f35209b;
                            if (view4 instanceof MBSplashPortView) {
                                view4.setVisibility(0);
                                ((MBSplashPortView) this.f35209b).setImageBitmap(bitmap);
                                return;
                            } else {
                                if (view4 instanceof MBSplashImageBgView) {
                                    view4.setVisibility(0);
                                    Bitmap bitmapM37809a2 = C13217p0.m37809a(bitmap);
                                    ((MBSplashImageBgView) this.f35209b).setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    ((MBSplashImageBgView) this.f35209b).setImageBitmap(bitmapM37809a2);
                                    return;
                                }
                                if (view4 instanceof InterBase) {
                                    String effectDes3 = ((InterBase) view4).getEffectDes();
                                    ViewGroup viewGroup3 = (ViewGroup) this.f35209b.getParent();
                                    if (viewGroup3 != null) {
                                        C12981d.m36407a(effectDes3, viewGroup3, true);
                                    }
                                }
                            }
                        }
                        ((ImageView) this.f35209b).setImageBitmap(bitmap);
                        return;
                    }
                } catch (Exception e) {
                    C13219q0.m37816b("MBDataBinding", e.getMessage());
                    return;
                }
            }
            ((ImageView) this.f35209b).setBackgroundColor(-7829368);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.binding.b$g */
    /* JADX INFO: compiled from: MBDataBinding.java */
    class g extends AbstractC13648b {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ View f35211g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ MBSplashData f35212h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i, int i2, View view, MBSplashData mBSplashData) {
            super(i, i2);
            this.f35211g = view;
            this.f35212h = mBSplashData;
        }

        @Override // com.mbridge.msdk.shake.AbstractC13648b
        /* JADX INFO: renamed from: a */
        public void mo36324a() {
            View view = this.f35211g;
            if (view != null) {
                try {
                    if (view.getGlobalVisibleRect(new Rect())) {
                        SplashResData splashResData = new SplashResData();
                        this.f35212h.setClickType(4);
                        splashResData.setBaseViewData(this.f35212h);
                        splashResData.seteAction(EAction.DOWNLOAD);
                        EventBus.getDefault().post(splashResData);
                        C13647a.m39776a().m39780b(C12959b.this.f35194f);
                    }
                } catch (Exception e) {
                    C13219q0.m37816b("MBDataBinding", e.getMessage());
                }
            }
        }
    }

    private C12959b() {
    }

    /* JADX INFO: renamed from: d */
    public void m36319d(View view) {
        m36307a(new a(view), view.getId());
    }

    /* JADX INFO: renamed from: b */
    public void m36317b(View view) {
        m36308a(new c(view), view.getId());
    }

    /* JADX INFO: renamed from: c */
    public void m36318c(View view) {
        m36306a(new b(view), view.getId());
    }

    /* JADX INFO: renamed from: a */
    public static C12959b m36295a() {
        if (f35188g == null) {
            synchronized (C12959b.class) {
                if (f35188g == null) {
                    f35188g = new C12959b();
                }
            }
        }
        return f35188g;
    }

    /* JADX INFO: renamed from: a */
    private void m36308a(InterfaceC12996i interfaceC12996i, int i) {
        C12991d c12991d = this.f35189a;
        if (c12991d != null) {
            c12991d.m36433a(interfaceC12996i, i);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36305a(InterfaceC12989b interfaceC12989b, int i) {
        C12990c c12990c = this.f35190b;
        if (c12990c != null) {
            c12990c.m36433a(interfaceC12989b, i);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36306a(InterfaceC12992e interfaceC12992e, int i) {
        C12993f c12993f = this.f35191c;
        if (c12993f != null) {
            c12993f.m36433a(interfaceC12992e, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m36310b(InterBase interBase, Object obj) {
        if (interBase == null || obj == null) {
            return;
        }
        String reportDes = interBase.getReportDes();
        if (TextUtils.isEmpty(reportDes)) {
            return;
        }
        try {
            if (!(obj instanceof InterfaceC12986a) || ((InterfaceC12986a) obj).getBindData() == null) {
                return;
            }
            interBase.setDynamicReport(reportDes, ((InterfaceC12986a) obj).getBindData());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public void m36312c(InterBase interBase, Object obj) {
        if (interBase == 0 || obj == null) {
            return;
        }
        String bindDataDes = interBase.getBindDataDes();
        if (TextUtils.isEmpty(bindDataDes)) {
            return;
        }
        try {
            Object objM36405a = C12981d.m36405a(obj, bindDataDes);
            if (objM36405a == null) {
                return;
            }
            if (interBase instanceof ViewGroup) {
                m36309b((ViewGroup) interBase, objM36405a, (InterfaceC12986a) obj);
            } else if (interBase instanceof View) {
                m36299a((View) interBase, objM36405a, (InterfaceC12986a) obj);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36307a(InterfaceC12994g interfaceC12994g, int i) {
        C12995h c12995h = this.f35192d;
        if (c12995h != null) {
            c12995h.m36433a(interfaceC12994g, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public void m36314a(View view) {
        if (view != 0) {
            try {
                if (view instanceof InterBase) {
                    String actionDes = ((InterBase) view).getActionDes();
                    if (TextUtils.isEmpty(actionDes)) {
                        return;
                    }
                    if (actionDes.startsWith("click")) {
                        m36305a(new d(view), view.getId());
                        return;
                    }
                    if (!actionDes.equals("move") && !actionDes.equals("long_click")) {
                        actionDes.equals("wobble");
                    }
                }
            } catch (Exception e2) {
                C13219q0.m37816b("MBDataBinding", e2.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m36309b(ViewGroup viewGroup, Object obj, InterfaceC12986a interfaceC12986a) {
        if (viewGroup != null) {
            if (viewGroup instanceof MBSplashClickView) {
                if (interfaceC12986a == null || interfaceC12986a.getEffectData() == null || !interfaceC12986a.getEffectData().isClickButtonVisible() || interfaceC12986a.getEffectData().isShakeVisible()) {
                    viewGroup.setVisibility(8);
                } else if (obj != null && !TextUtils.isEmpty(obj.toString())) {
                    viewGroup.setVisibility(0);
                    ((MBSplashClickView) viewGroup).initView(obj.toString());
                }
            }
            if (viewGroup instanceof MBSplashShakeView) {
                if (interfaceC12986a != null && interfaceC12986a.getEffectData() != null && interfaceC12986a.getEffectData().isShakeVisible()) {
                    if (obj == null || TextUtils.isEmpty(obj.toString())) {
                        return;
                    }
                    viewGroup.setVisibility(0);
                    ((MBSplashShakeView) viewGroup).initView(obj.toString());
                    return;
                }
                viewGroup.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m36316b() {
        C12990c c12990c = this.f35190b;
        if (c12990c != null) {
            c12990c.m36432a();
        }
        C12991d c12991d = this.f35189a;
        if (c12991d != null) {
            c12991d.m36432a();
        }
        C12993f c12993f = this.f35191c;
        if (c12993f != null) {
            c12993f.m36432a();
        }
        if (this.f35193e != null) {
            this.f35193e = null;
        }
        if (this.f35194f != null) {
            this.f35194f = null;
        }
        if (f35188g != null) {
            f35188g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public void m36302a(InterBase interBase, Object obj) {
        if (interBase == 0 || obj == null) {
            return;
        }
        String effectDes = interBase.getEffectDes();
        if (TextUtils.isEmpty(effectDes)) {
            return;
        }
        try {
            if (interBase instanceof ViewGroup) {
                m36301a((ViewGroup) interBase, (Object) effectDes, (InterfaceC12986a) obj);
            } else if (interBase instanceof View) {
                m36300a((View) interBase, effectDes, obj);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36301a(ViewGroup viewGroup, Object obj, InterfaceC12986a interfaceC12986a) {
        if (obj == null || !(obj instanceof String)) {
            return;
        }
        if (obj.equals("wobble") && (viewGroup instanceof MBSplashShakeView)) {
            if (interfaceC12986a.getEffectData().isShakeVisible()) {
                if (this.f35194f != null) {
                    C13647a.m39776a().m39780b(this.f35194f);
                }
                C13647a.m39776a().m39778a(m36296a((View) viewGroup, (MBSplashData) interfaceC12986a));
            } else if (this.f35194f != null) {
                C13647a.m39776a().m39780b(this.f35194f);
            }
        }
        if (obj.equals("visible") && (viewGroup instanceof MBApkInfoView)) {
            if (interfaceC12986a.getEffectData().isApkInfoVisible()) {
                if ((interfaceC12986a instanceof MBSplashData) && !TextUtils.isEmpty(((MBSplashData) interfaceC12986a).getAppInfo())) {
                    viewGroup.setVisibility(0);
                } else {
                    viewGroup.setVisibility(4);
                }
            } else {
                viewGroup.setVisibility(8);
            }
        }
        obj.equals("anim");
    }

    /* JADX INFO: renamed from: a */
    private void m36300a(View view, Object obj, Object obj2) {
        View view2;
        int countDownTime;
        boolean z;
        if (obj == null || !(obj instanceof String)) {
            return;
        }
        InterfaceC12986a interfaceC12986a = (InterfaceC12986a) obj2;
        if (!obj.equals("countdown") || view == null || !(view instanceof TextView) || interfaceC12986a == null) {
            view2 = view;
        } else {
            TextView textView = (TextView) view;
            String str = (String) textView.getText();
            String strM37763p = C13211m0.m37763p(view.getContext());
            DyOption effectData = interfaceC12986a.getEffectData();
            if (effectData != null) {
                boolean zIsCanSkip = effectData.isCanSkip();
                countDownTime = effectData.getCountDownTime();
                z = zIsCanSkip;
            } else {
                countDownTime = 5;
                z = false;
            }
            textView.setText(C12981d.m36406a(z, countDownTime, str, strM37763p));
            view2 = view;
            interfaceC12986a.getEffectData().setDyCountDownListenerWrapper(new e(z, str, strM37763p, view2));
        }
        obj.equals("anim");
        if (obj.equals("visible")) {
            if (view2 instanceof MBFeedBack) {
                if (C13084b.m37036b().m37050a()) {
                    view2.setVisibility(0);
                } else {
                    view2.setVisibility(8);
                }
            }
            if (!(view2 instanceof MBLogoTextView) || interfaceC12986a == null || interfaceC12986a.getEffectData() == null || interfaceC12986a.getEffectData().isLogoVisible()) {
                return;
            }
            ((MBLogoTextView) view2).setCompoundDrawables(null, null, null, null);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36299a(View view, Object obj, InterfaceC12986a interfaceC12986a) {
        if (view == null || obj == null) {
            return;
        }
        try {
            if (view instanceof TextView) {
                try {
                    ((TextView) view).setText(String.valueOf(obj).replace("\\n", "\n"));
                    return;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            }
            if (view instanceof ImageView) {
                if (obj instanceof Integer) {
                    ((ImageView) view).setImageResource(((Integer) obj).intValue());
                }
                if (obj instanceof String) {
                    C13100b.m37152a(C13008c.m36588n().m36542d()).m37155a(obj.toString(), new f(interfaceC12986a, view));
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m36298a(View view, Object obj) {
        if (view == null || obj == null || !(obj instanceof InterfaceC12986a)) {
            return;
        }
        view.setOnClickListener(new ViewOnClickListenerC12958a((InterfaceC12986a) obj));
    }

    /* JADX INFO: renamed from: a */
    public void m36315a(BaseViewModel baseViewModel) {
        this.f35193e = baseViewModel;
        if (baseViewModel != null) {
            baseViewModel.setClickSubject(this.f35190b);
            this.f35193e.setConcreteSubject(this.f35189a);
            this.f35193e.setEffectSubject(this.f35191c);
            this.f35193e.setReportSubject(this.f35192d);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    /* JADX INFO: renamed from: a */
    private AbstractC13648b m36296a(View view, MBSplashData mBSplashData) {
        C12959b c12959b;
        if (mBSplashData != null) {
            try {
                DyOption dyOption = mBSplashData.getDyOption();
                if (dyOption != null && dyOption.isShakeVisible() && this.f35194f == null) {
                    c12959b = this;
                    try {
                        c12959b.f35194f = c12959b.new g(dyOption.getShakeStrenght(), dyOption.getShakeTime() * 1000, view, mBSplashData);
                    } catch (Exception e2) {
                        e = e2;
                        C13219q0.m37816b("MBDataBinding", e.getMessage());
                    }
                } else {
                    c12959b = this;
                }
            } catch (Exception e3) {
                e = e3;
                c12959b = this;
            }
        } else {
            c12959b = this;
        }
        return c12959b.f35194f;
    }
}
