package com.google.android.gms.games;

import android.app.Activity;
import com.google.android.gms.internal.games_v2.zzar;
import com.google.android.gms.internal.games_v2.zzax;
import com.google.android.gms.internal.games_v2.zzbr;
import com.google.android.gms.internal.games_v2.zzce;
import com.google.android.gms.internal.games_v2.zzcl;
import com.google.android.gms.internal.games_v2.zzco;
import com.google.android.gms.internal.games_v2.zzdj;
import com.google.android.gms.internal.games_v2.zzdm;
import com.google.android.gms.internal.games_v2.zzef;
import com.google.android.gms.internal.games_v2.zzey;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class PlayGames {
    private PlayGames() {
    }

    public static AchievementsClient getAchievementsClient(Activity activity) {
        zzbr.zzb();
        return new zzce(zzar.zza(zzbr.zza()));
    }

    public static EventsClient getEventsClient(Activity activity) {
        zzbr.zzb();
        return new zzcl(zzar.zza(zzbr.zza()));
    }

    public static GamesSignInClient getGamesSignInClient(Activity activity) {
        zzbr.zzb();
        return new zzco(zzax.zza(zzbr.zza()), zzar.zza(zzbr.zza()));
    }

    public static LeaderboardsClient getLeaderboardsClient(Activity activity) {
        zzbr.zzb();
        return new zzdj(zzar.zza(zzbr.zza()));
    }

    public static PlayerStatsClient getPlayerStatsClient(Activity activity) {
        zzbr.zzb();
        return new zzdm(zzar.zza(zzbr.zza()));
    }

    public static PlayersClient getPlayersClient(Activity activity) {
        zzbr.zzb();
        return new zzef(zzar.zza(zzbr.zza()));
    }

    public static SnapshotsClient getSnapshotsClient(Activity activity) {
        zzbr.zzb();
        return new zzey(zzar.zza(zzbr.zza()));
    }
}
