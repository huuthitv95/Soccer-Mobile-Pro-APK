package com.applovin.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: renamed from: com.applovin.impl.s */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1713s {
    /* JADX INFO: renamed from: a */
    public static MaxAdFormat m4301a(Context context) {
        return (AppLovinSdkUtils.isTablet(context) || AppLovinSdkUtils.isTv(context)) ? MaxAdFormat.LEADER : MaxAdFormat.BANNER;
    }

    /* JADX INFO: renamed from: a */
    public static AppLovinAdSize m4302a(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(AppLovinAdView.NAMESPACE, "size");
        if (StringUtils.isValidString(attributeValue)) {
            return AppLovinAdSize.fromString(attributeValue);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m4303a(Context context, AttributeSet attributeSet, String str, String str2) {
        if (context == null || attributeSet == null || str == null || str2 == null) {
            return null;
        }
        int attributeResourceValue = attributeSet.getAttributeResourceValue(str, str2, 0);
        return attributeResourceValue == 0 ? attributeSet.getAttributeValue(str, str2) : context.getResources().getString(attributeResourceValue);
    }

    /* JADX INFO: renamed from: a */
    public static void m4304a(ViewGroup viewGroup, View view) {
        if (viewGroup == null) {
            return;
        }
        int iIndexOfChild = viewGroup.indexOfChild(view);
        if (iIndexOfChild == -1) {
            viewGroup.removeAllViews();
        } else {
            viewGroup.removeViews(0, iIndexOfChild);
            viewGroup.removeViews(1, viewGroup.getChildCount() - 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4305a(View view) {
        if (view == null || view.getRootView() == null || !(view.getRootView().getLayoutParams() instanceof WindowManager.LayoutParams)) {
            return false;
        }
        int i = ((WindowManager.LayoutParams) view.getRootView().getLayoutParams()).type;
        if (i == 2002 || i == 2007 || i == 2003 || i == 2010 || i == 2006) {
            return true;
        }
        return AbstractC1677p0.m3811e() && i == 2038;
    }

    /* JADX INFO: renamed from: b */
    public static void m4306b(ViewGroup viewGroup, View view) {
        if (viewGroup == null) {
            return;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt != null && childAt != view) {
                viewGroup.removeViewAt(childCount);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4307b(AttributeSet attributeSet) {
        return attributeSet != null && attributeSet.getAttributeBooleanValue(AppLovinAdView.NAMESPACE, "loadAdOnCreate", false);
    }
}
