package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import androidx.privacysandbox.ads.adservices.topics.Topic;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzfcr implements zzhaq {
    static final /* synthetic */ zzfcr zza = new zzfcr();

    private /* synthetic */ zzfcr() {
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        GetTopicsResponse getTopicsResponse = (GetTopicsResponse) obj;
        if (getTopicsResponse == null) {
            return zzhbi.zza(new zzfct("", 1, null));
        }
        zzihm zzihmVarZzc = zzihn.zzc();
        for (Topic topic : getTopicsResponse.getTopics()) {
            zzihk zzihkVarZzc = zzihl.zzc();
            zzihkVarZzc.zza(topic.getTopicId());
            zzihkVarZzc.zzb(topic.getModelVersion());
            zzihkVarZzc.zzc(topic.getTaxonomyVersion());
            zzihmVarZzc.zza((zzihl) zzihkVarZzc.zzbu());
        }
        return zzhbi.zza(new zzfct(Base64.encodeToString(((zzihn) zzihmVarZzc.zzbu()).zzaN(), 1), 1, null));
    }
}
