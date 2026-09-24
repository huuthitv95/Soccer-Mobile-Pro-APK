package com.mbridge.msdk.dycreator.wrapper;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.dycreator.binding.C12959b;
import com.mbridge.msdk.dycreator.engine.C12972b;
import com.mbridge.msdk.dycreator.error.C12974a;
import com.mbridge.msdk.dycreator.error.EnumC12975b;
import com.mbridge.msdk.dycreator.utils.C12983f;
import com.mbridge.msdk.dycreator.viewmodel.BaseViewModel;
import com.mbridge.msdk.dycreator.viewmodel.MBCommonViewVModel;
import com.mbridge.msdk.dycreator.viewmodel.MBRewardViewVModel;
import com.mbridge.msdk.dycreator.viewmodel.MBSplashViewVModel;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.io.File;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class DynamicViewCreator {

    /* JADX INFO: renamed from: a */
    private static volatile DynamicViewCreator f35438a = null;

    /* JADX INFO: renamed from: b */
    private static int f35439b = -201;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator$1 */
    static /* synthetic */ class C129971 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f35440a;

        static {
            int[] iArr = new int[DyAdType.values().length];
            f35440a = iArr;
            try {
                iArr[DyAdType.SPLASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35440a[DyAdType.REWARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private DynamicViewCreator() {
        C12972b.m36361a().m36364a(C13008c.m36588n().m36542d());
    }

    /* JADX INFO: renamed from: a */
    private View m36455a(Context context, DyOption dyOption) {
        List<String> fileDirs;
        ViewGroup viewGroup = null;
        if (dyOption == null || (fileDirs = dyOption.getFileDirs()) == null) {
            return null;
        }
        for (int i = 0; i < fileDirs.size(); i++) {
            try {
                if (!TextUtils.isEmpty(fileDirs.get(i))) {
                    if (i == 0) {
                        viewGroup = (ViewGroup) C12983f.m36417a(context).m36419a(fileDirs.get(i));
                    } else {
                        m36457a(context, viewGroup, fileDirs.get(i));
                    }
                }
            } catch (Exception e) {
                C13219q0.m37816b("DynamicViewCreator", e.getMessage());
            }
        }
        return viewGroup;
    }

    public static DynamicViewCreator getInstance() {
        if (f35438a == null) {
            synchronized (DynamicViewCreator.class) {
                if (f35438a == null) {
                    f35438a = new DynamicViewCreator();
                }
            }
        }
        return f35438a;
    }

    public void createDynamicView(DyOption dyOption, DynamicViewBackListener dynamicViewBackListener) {
        BaseViewModel mBSplashViewVModel;
        BaseViewModel mBCommonViewVModel;
        if (dyOption == null) {
            dynamicViewBackListener.viewCreateFail(new C12974a(EnumC12975b.NOT_FOUND_DYNAMIC_OPTION));
            return;
        }
        if (dynamicViewBackListener == null) {
            return;
        }
        Context contextM36542d = C13008c.m36588n().m36542d();
        if (contextM36542d == null) {
            dynamicViewBackListener.viewCreateFail(new C12974a(EnumC12975b.NOT_FOUND_CONTEXT));
            return;
        }
        if (m36458a(dyOption, dynamicViewBackListener, new String[0])) {
            try {
                View viewM36455a = m36455a(contextM36542d, dyOption);
                if (viewM36455a == null) {
                    dynamicViewBackListener.viewCreateFail(new C12974a(EnumC12975b.FILE_CREATE_VIEW_FILE));
                    return;
                }
                int i = C129971.f35440a[dyOption.getDyAdType().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        mBCommonViewVModel = new MBCommonViewVModel();
                    } else {
                        mBSplashViewVModel = new MBRewardViewVModel(dyOption);
                    }
                    mBCommonViewVModel.setDynamicViewBackListener(dynamicViewBackListener);
                    C12959b.m36295a().m36315a(mBCommonViewVModel);
                    mBCommonViewVModel.setModelDataAndBind();
                    dynamicViewBackListener.viewCreatedSuccess(viewM36455a);
                }
                mBSplashViewVModel = new MBSplashViewVModel(dyOption);
                mBCommonViewVModel = mBSplashViewVModel;
                mBCommonViewVModel.setDynamicViewBackListener(dynamicViewBackListener);
                C12959b.m36295a().m36315a(mBCommonViewVModel);
                mBCommonViewVModel.setModelDataAndBind();
                dynamicViewBackListener.viewCreatedSuccess(viewM36455a);
            } catch (Exception e) {
                C13219q0.m37816b("DynamicViewCreator", e.getMessage());
                dynamicViewBackListener.viewCreateFail(new C12974a(f35439b, e.getMessage()));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36457a(Context context, ViewGroup viewGroup, String str) {
        if (context == null || viewGroup == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("folder_dir");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(jSONObject.optString("ext_template"));
            if (jSONArray.length() == 0) {
                return;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    View viewM36419a = C12983f.m36417a(context).m36419a(string + File.separator + jSONObject2.optString("name"));
                    if (viewM36419a != null) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("layout");
                        if (jSONObject3 != null) {
                            m36456a(context, viewGroup, viewM36419a, jSONObject3);
                        } else {
                            viewGroup.addView(viewM36419a, 3);
                        }
                    }
                }
            }
        } catch (Exception e) {
            C13219q0.m37816b("DynamicViewCreator", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36456a(Context context, ViewGroup viewGroup, View view, JSONObject jSONObject) {
        if (context == null || viewGroup == null || view == null || jSONObject == null) {
            return;
        }
        try {
            String strOptString = jSONObject.optString("parent_id");
            if (!TextUtils.isEmpty(strOptString)) {
                viewGroup = (ViewGroup) C12983f.m36417a(context).m36418a(viewGroup, strOptString);
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            String strOptString2 = jSONObject.optString("below", "");
            if (!TextUtils.isEmpty(strOptString2)) {
                layoutParams.addRule(3, strOptString2.hashCode());
            }
            String strOptString3 = jSONObject.optString("left_of", "");
            if (!TextUtils.isEmpty(strOptString3)) {
                layoutParams.addRule(0, strOptString3.hashCode());
            }
            String strOptString4 = jSONObject.optString("right_of", "");
            if (!TextUtils.isEmpty(strOptString4)) {
                layoutParams.addRule(1, strOptString4.hashCode());
            }
            int iOptInt = jSONObject.optInt("index", -2);
            int iOptInt2 = jSONObject.optInt("visibility", -1);
            if (iOptInt2 != -1) {
                view.setVisibility(iOptInt2);
            }
            if (iOptInt != -2) {
                viewGroup.addView(view, iOptInt, layoutParams);
            } else {
                viewGroup.addView(view, layoutParams);
            }
        } catch (Exception e) {
            C13219q0.m37816b("DynamicViewCreator", e.getMessage());
        }
    }

    public View createDynamicView(DyOption dyOption) {
        Context contextM36542d;
        if (dyOption == null || (contextM36542d = C13008c.m36588n().m36542d()) == null) {
            return null;
        }
        return m36455a(contextM36542d, dyOption);
    }

    /* JADX INFO: renamed from: a */
    private boolean m36458a(DyOption dyOption, DynamicViewBackListener dynamicViewBackListener, String... strArr) {
        boolean z = true;
        if (dyOption != null) {
            if (dyOption.getCampaignEx() == null) {
                dynamicViewBackListener.viewCreateFail(new C12974a(EnumC12975b.NOT_FOUND_CAMPAIGN));
                z = false;
            }
            if (dyOption.getFile() == null && dyOption.getFileDirs() != null) {
                dynamicViewBackListener.viewCreateFail(new C12974a(EnumC12975b.BIND_DATA_FILE_OR_DIR));
                z = false;
            }
            if (strArr != null && strArr.length > 0) {
                for (String str : strArr) {
                    if (TextUtils.isEmpty(str)) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }
}
