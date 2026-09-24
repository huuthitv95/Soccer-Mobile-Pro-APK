package androidx.media3.p008ui;

import android.adservices.adid.AdId;
import android.adservices.adid.AdIdManager;
import android.adservices.adselection.AdSelectionConfig;
import android.adservices.adselection.AdSelectionFromOutcomesConfig;
import android.adservices.adselection.AdSelectionManager;
import android.adservices.adselection.AdSelectionOutcome;
import android.adservices.adselection.GetAdSelectionDataOutcome;
import android.adservices.adselection.GetAdSelectionDataRequest;
import android.adservices.adselection.PersistAdSelectionResultRequest;
import android.adservices.adselection.ReportEventRequest;
import android.adservices.adselection.ReportImpressionRequest;
import android.adservices.adselection.UpdateAdCounterHistogramRequest;
import android.adservices.common.AdTechIdentifier;
import android.media.MediaParser$InputReader;
import android.view.SurfaceControl;
import android.window.SurfaceSyncGroup;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DefaultTimeBar$$ExternalSyntheticApiModelOutline0 {
    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ AdId m564m(Object obj) {
        return (AdId) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ AdIdManager m566m(Object obj) {
        return (AdIdManager) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ AdSelectionConfig.Builder m567m() {
        return new AdSelectionConfig.Builder();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ AdSelectionFromOutcomesConfig.Builder m574m() {
        return new AdSelectionFromOutcomesConfig.Builder();
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ AdSelectionManager m581m(Object obj) {
        return (AdSelectionManager) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ AdSelectionOutcome m582m(Object obj) {
        return (AdSelectionOutcome) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ GetAdSelectionDataOutcome m583m(Object obj) {
        return (GetAdSelectionDataOutcome) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ GetAdSelectionDataRequest.Builder m584m() {
        return new GetAdSelectionDataRequest.Builder();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ PersistAdSelectionResultRequest.Builder m588m() {
        return new PersistAdSelectionResultRequest.Builder();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ ReportEventRequest.Builder m593m(long j, String str, String str2, int i) {
        return new ReportEventRequest.Builder(j, str, str2, i);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ ReportImpressionRequest m596m(long j) {
        return new ReportImpressionRequest(j);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ ReportImpressionRequest m597m(long j, AdSelectionConfig adSelectionConfig) {
        return new ReportImpressionRequest(j, adSelectionConfig);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ UpdateAdCounterHistogramRequest.Builder m598m(long j, int i, AdTechIdentifier adTechIdentifier) {
        return new UpdateAdCounterHistogramRequest.Builder(j, i, adTechIdentifier);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ MediaParser$InputReader m604m(Object obj) {
        return (MediaParser$InputReader) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ SurfaceControl.Transaction m614m() {
        return new SurfaceControl.Transaction();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ SurfaceSyncGroup m615m(String str) {
        return new SurfaceSyncGroup(str);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ Class m616m() {
        return AdIdManager.class;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m620m() {
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return AdSelectionManager.class;
    }

    /* JADX INFO: renamed from: m$1, reason: collision with other method in class */
    public static /* synthetic */ void m43629m$1() {
    }

    public static /* synthetic */ void m$2() {
    }
}
