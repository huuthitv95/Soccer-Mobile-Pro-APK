package com.ironsource;

import com.facebook.internal.security.CertificateUtil;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.t5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12526t5 {

    /* JADX INFO: renamed from: a */
    public static final C12526t5 f32437a = new C12526t5();

    private C12526t5() {
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ IronSourceError m33737a(C12526t5 c12526t5, EnumC11765Y7 enumC11765Y7, IronSourceError ironSourceError, int i, Object obj) {
        if ((i & 2) != 0) {
            ironSourceError = null;
        }
        return c12526t5.m33735a(enumC11765Y7, ironSourceError);
    }

    /* JADX INFO: renamed from: b */
    public final IronSourceError m33744b() {
        return m33737a(this, EnumC11765Y7.ISErrorInitHttpRequestFailed, null, 2, null);
    }

    /* JADX INFO: renamed from: c */
    public final IronSourceError m33747c() {
        return m33737a(this, EnumC11765Y7.ISErrorInitInvalidResponse, null, 2, null);
    }

    /* JADX INFO: renamed from: d */
    public final IronSourceError m33750d() {
        return m33737a(this, EnumC11765Y7.ISErrorLoadADMDecryptionFailure, null, 2, null);
    }

    /* JADX INFO: renamed from: e */
    public final IronSourceError m33752e() {
        return m33737a(this, EnumC11765Y7.ISErrorLoadADMEmptyServerData, null, 2, null);
    }

    /* JADX INFO: renamed from: f */
    public final IronSourceError m33753f() {
        return m33737a(this, EnumC11765Y7.ISErrorLoadADMEmptyWaterfall, null, 2, null);
    }

    /* JADX INFO: renamed from: g */
    public final IronSourceError m33754g() {
        return m33737a(this, EnumC11765Y7.ISErrorLoadADMInvalidConfigurationForRequestedNetwork, null, 2, null);
    }

    /* JADX INFO: renamed from: h */
    public final IronSourceError m33755h() {
        return m33737a(this, EnumC11765Y7.ISErrorLoadADMInvalidJSON, null, 2, null);
    }

    /* JADX INFO: renamed from: i */
    public final IronSourceError m33756i() {
        return m33737a(this, EnumC11765Y7.ISErrorLoadADMNoAuctionID, null, 2, null);
    }

    /* JADX INFO: renamed from: j */
    public final IronSourceError m33757j() {
        return m33737a(this, EnumC11765Y7.ISErrorLoadADMNoConfigurationForRequestedNetwork, null, 2, null);
    }

    /* JADX INFO: renamed from: k */
    public final IronSourceError m33758k() {
        return m33737a(this, EnumC11765Y7.ISErrorLoadBannerNetworkViewIsNull, null, 2, null);
    }

    /* JADX INFO: renamed from: l */
    public final IronSourceError m33759l() {
        return m33737a(this, EnumC11765Y7.ISErrorLoadBannerNotSupportedSize, null, 2, null);
    }

    /* JADX INFO: renamed from: m */
    public final IronSourceError m33760m() {
        return m33737a(this, EnumC11765Y7.ISErrorLoadBannerSizeIsNull, null, 2, null);
    }

    /* JADX INFO: renamed from: n */
    public final IronSourceError m33761n() {
        return m33737a(this, EnumC11765Y7.ISErrorLoadBiddingInNonBidding, null, 2, null);
    }

    /* JADX INFO: renamed from: o */
    public final IronSourceError m33762o() {
        return m33737a(this, EnumC11765Y7.ISErrorLoadInstanceNotInInitResponse, null, 2, null);
    }

    /* JADX INFO: renamed from: p */
    public final IronSourceError m33763p() {
        return m33737a(this, EnumC11765Y7.ISErrorLoadNoAdFormatConfigurations, null, 2, null);
    }

    /* JADX INFO: renamed from: q */
    public final IronSourceError m33764q() {
        return m33737a(this, EnumC11765Y7.ISErrorLoadNullADM, null, 2, null);
    }

    /* JADX INFO: renamed from: r */
    public final IronSourceError m33765r() {
        return m33737a(this, EnumC11765Y7.ISErrorLoadSDKNotInitialized, null, 2, null);
    }

    /* JADX INFO: renamed from: s */
    public final IronSourceError m33766s() {
        return m33737a(this, EnumC11765Y7.ISErrorLoadTimedOut, null, 2, null);
    }

    /* JADX INFO: renamed from: t */
    public final IronSourceError m33767t() {
        return m33737a(this, EnumC11765Y7.ISErrorShowNotReadyToShowAd, null, 2, null);
    }

    /* JADX INFO: renamed from: a */
    private final IronSourceError m33735a(EnumC11765Y7 enumC11765Y7, IronSourceError ironSourceError) {
        String strM28017c;
        if (ironSourceError != null) {
            strM28017c = enumC11765Y7.m28017c() + " Underlying network error: '" + ironSourceError.getErrorCode() + CertificateUtil.DELIMITER + ironSourceError.getErrorMessage() + "'";
        } else {
            strM28017c = enumC11765Y7.m28017c();
        }
        return new IronSourceError(enumC11765Y7.m28016b(), strM28017c);
    }

    /* JADX INFO: renamed from: b */
    public final IronSourceError m33745b(IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return m33735a(EnumC11765Y7.ISErrorLoadNetworkFailed, error);
    }

    /* JADX INFO: renamed from: c */
    public final IronSourceError m33749c(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return m33736a(EnumC11765Y7.ISErrorLoadNetworkFailed, description);
    }

    /* JADX INFO: renamed from: d */
    public final IronSourceError m33751d(String str) {
        return m33736a(EnumC11765Y7.ISErrorRewardedLoadNoConfig, str);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ IronSourceError m33739b(C12526t5 c12526t5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c12526t5.m33746b(str);
    }

    /* JADX INFO: renamed from: c */
    public final IronSourceError m33748c(IronSourceError networkError) {
        Intrinsics.checkNotNullParameter(networkError, "networkError");
        return m33735a(EnumC11765Y7.ISErrorShowNetworkFailed, networkError);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ IronSourceError m33740c(C12526t5 c12526t5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c12526t5.m33751d(str);
    }

    /* JADX INFO: renamed from: b */
    public final IronSourceError m33746b(String str) {
        return m33736a(EnumC11765Y7.ISErrorInterstitialLoadNoConfig, str);
    }

    /* JADX INFO: renamed from: a */
    private final IronSourceError m33736a(EnumC11765Y7 enumC11765Y7, String str) {
        if (str == null || str.length() == 0) {
            str = enumC11765Y7.m28017c();
        }
        return new IronSourceError(enumC11765Y7.m28016b(), str);
    }

    /* JADX INFO: renamed from: a */
    public final IronSourceError m33742a(IronSourceError networkError) {
        Intrinsics.checkNotNullParameter(networkError, "networkError");
        return m33735a(EnumC11765Y7.ISErrorInitNetworkFailed, networkError);
    }

    /* JADX INFO: renamed from: a */
    public final IronSourceError m33741a() {
        return m33737a(this, EnumC11765Y7.ISErrorInitDecryptionFailure, null, 2, null);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ IronSourceError m33738a(C12526t5 c12526t5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c12526t5.m33743a(str);
    }

    /* JADX INFO: renamed from: a */
    public final IronSourceError m33743a(String str) {
        return m33736a(EnumC11765Y7.ISErrorBannerLoadNoConfig, str);
    }
}
