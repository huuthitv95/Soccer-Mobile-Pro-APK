package androidx.privacysandbox.ads.adservices.common;

import android.adservices.appsetid.AppSetId;
import android.adservices.appsetid.AppSetIdManager;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.FetchAndJoinCustomAudienceRequest;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.LeaveCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceParams;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerParams;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.net.Uri;
import java.time.Duration;
import java.util.List;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AdFilters$$ExternalSyntheticApiModelOutline0 {
    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ AppSetId m657m(Object obj) {
        return (AppSetId) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ AppSetIdManager m658m(Object obj) {
        return (AppSetIdManager) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ android.adservices.common.AdData.Builder m659m() {
        return new android.adservices.common.AdData.Builder();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ android.adservices.common.AdFilters.Builder m665m() {
        return new android.adservices.common.AdFilters.Builder();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ android.adservices.common.FrequencyCapFilters.Builder m670m() {
        return new android.adservices.common.FrequencyCapFilters.Builder();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ android.adservices.common.KeyedFrequencyCap.Builder m673m(int i, int i2, Duration duration) {
        return new android.adservices.common.KeyedFrequencyCap.Builder(i, i2, duration);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ CustomAudience.Builder m675m() {
        return new CustomAudience.Builder();
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ CustomAudienceManager m685m(Object obj) {
        return (CustomAudienceManager) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ FetchAndJoinCustomAudienceRequest.Builder m689m(Uri uri) {
        return new FetchAndJoinCustomAudienceRequest.Builder(uri);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ JoinCustomAudienceRequest.Builder m691m() {
        return new JoinCustomAudienceRequest.Builder();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ LeaveCustomAudienceRequest.Builder m694m() {
        return new LeaveCustomAudienceRequest.Builder();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ TrustedBiddingData.Builder m698m() {
        return new TrustedBiddingData.Builder();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ DeletionRequest.Builder m702m() {
        return new DeletionRequest.Builder();
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ MeasurementManager m708m(Object obj) {
        return (MeasurementManager) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ WebSourceParams.Builder m710m(Uri uri) {
        return new WebSourceParams.Builder(uri);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ WebSourceRegistrationRequest.Builder m714m(List list, Uri uri) {
        return new WebSourceRegistrationRequest.Builder(list, uri);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ WebTriggerParams.Builder m717m(Uri uri) {
        return new WebTriggerParams.Builder(uri);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ WebTriggerRegistrationRequest.Builder m719m(List list, Uri uri) {
        return new WebTriggerRegistrationRequest.Builder(list, uri);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ Class m721m() {
        return AppSetIdManager.class;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m724m() {
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return CustomAudienceManager.class;
    }

    /* JADX INFO: renamed from: m$1, reason: collision with other method in class */
    public static /* synthetic */ void m43641m$1() {
    }

    public static /* bridge */ /* synthetic */ Class m$2() {
        return MeasurementManager.class;
    }

    /* JADX INFO: renamed from: m$2, reason: collision with other method in class */
    public static /* synthetic */ void m43642m$2() {
    }

    public static /* synthetic */ void m$3() {
    }

    public static /* synthetic */ void m$4() {
    }
}
