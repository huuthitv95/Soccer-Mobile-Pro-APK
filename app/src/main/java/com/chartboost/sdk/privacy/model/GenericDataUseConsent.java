package com.chartboost.sdk.privacy.model;

import androidx.core.app.NotificationCompat;
import com.chartboost.sdk.impl.AbstractC3738ei;
import com.chartboost.sdk.impl.AbstractC4142wh;
import com.chartboost.sdk.impl.C3692ci;
import com.chartboost.sdk.impl.C3954o5;
import com.chartboost.sdk.impl.C4076th;
import com.chartboost.sdk.impl.InterfaceC3807hi;
import com.chartboost.sdk.impl.InterfaceC3911m7;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m43474d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000b\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010*\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\fJ\u0014\u0010\u000b\u001a\u00020\t*\u00020\tH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\u0017J\u0014\u0010\r\u001a\u00020\t*\u00020\tH\u0096\u0001¢\u0006\u0004\b\r\u0010\u0017J\u0014\u0010\u0010\u001a\u00020\u000e*\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0018J\u0014\u0010\u0014\u001a\u00020\u0012*\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0019J\u0014\u0010\u0016\u001a\u00020\t*\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u0004¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\u00020\u00038\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b\u001d\u0010\u001cR\"\u0010'\u001a\u00020\"8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b\u001b\u0010%\"\u0004\b\u001b\u0010&R\u0014\u0010)\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010 ¨\u0006-"}, m43475d2 = {"Lcom/chartboost/sdk/privacy/model/GenericDataUseConsent;", "Lcom/chartboost/sdk/privacy/model/DataUseConsent;", "Lcom/chartboost/sdk/impl/m7;", "", "type", FirebaseAnalytics.Param.LOCATION, "", "clear", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/chartboost/sdk/impl/ei;", NotificationCompat.CATEGORY_EVENT, "clearFromStorage", "(Lcom/chartboost/sdk/impl/ei;)V", "persist", "Lcom/chartboost/sdk/impl/ci;", "config", ToolBar.REFRESH, "(Lcom/chartboost/sdk/impl/ci;)V", "Lcom/chartboost/sdk/impl/th;", "ad", C11744X3.i.f26349U, "(Lcom/chartboost/sdk/impl/th;)V", "track", "(Lcom/chartboost/sdk/impl/ei;)Lcom/chartboost/sdk/impl/ei;", "(Lcom/chartboost/sdk/impl/ci;)Lcom/chartboost/sdk/impl/ci;", "(Lcom/chartboost/sdk/impl/th;)Lcom/chartboost/sdk/impl/th;", NotificationCompat.CATEGORY_MESSAGE, "a", "(Ljava/lang/String;)V", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "getPrivacyStandardName", "()Ljava/lang/String;", "privacyStandardName", "", "c", "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "consentValue", "getPrivacyStandard", "privacyStandard", "eventTracker", "<init>", "(Lcom/chartboost/sdk/impl/m7;)V", "ChartboostMonetization-9.11.1_productionRelease"}, m43476k = 1, m43477mv = {1, 9, 0})
public abstract class GenericDataUseConsent implements DataUseConsent, InterfaceC3911m7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC3911m7 f17280a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public String privacyStandardName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public Object consentValue;

    /* JADX WARN: Multi-variable type inference failed */
    public GenericDataUseConsent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public GenericDataUseConsent(InterfaceC3911m7 eventTracker) {
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f17280a = eventTracker;
        this.privacyStandardName = "";
        this.consentValue = "";
    }

    public /* synthetic */ GenericDataUseConsent(InterfaceC3911m7 interfaceC3911m7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AbstractC4142wh.m19810a() : interfaceC3911m7);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getConsentValue() {
        return this.consentValue;
    }

    /* JADX INFO: renamed from: a */
    public final void m20264a(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.consentValue = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m20265a(String msg) {
        try {
            track((AbstractC3738ei) new C3954o5(InterfaceC3807hi.d.CREATION_ERROR, msg == null ? "no message" : msg, "", "", null, null, 48, null));
            throw new Exception(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m20266b(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.privacyStandardName = str;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f17280a.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei clearFromStorage(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f17280a.clearFromStorage(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo43985clearFromStorage(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f17280a.mo43985clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.privacy.model.DataUseConsent
    /* JADX INFO: renamed from: getPrivacyStandard, reason: from getter */
    public String getPrivacyStandardName() {
        return this.privacyStandardName;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei persist(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f17280a.persist(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: persist */
    public void mo43986persist(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f17280a.mo43986persist(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C3692ci refresh(C3692ci c3692ci) {
        Intrinsics.checkNotNullParameter(c3692ci, "<this>");
        return this.f17280a.refresh(c3692ci);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: refresh */
    public void mo43987refresh(C3692ci config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f17280a.mo43987refresh(config);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C4076th store(C4076th c4076th) {
        Intrinsics.checkNotNullParameter(c4076th, "<this>");
        return this.f17280a.store(c4076th);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: store */
    public void mo43988store(C4076th ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f17280a.mo43988store(ad);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei track(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f17280a.track(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: track */
    public void mo43989track(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f17280a.mo43989track(event);
    }
}
