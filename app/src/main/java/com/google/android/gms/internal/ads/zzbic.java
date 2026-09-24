package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
@ParametersAreNonnullByDefault
public final class zzbic implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    private final void zzg(final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.zzh = new JSONObject((String) zzbig.zza(new zzgto() { // from class: com.google.android.gms.internal.ads.zzbhz
                    @Override // com.google.android.gms.internal.ads.zzgto
                    public final /* synthetic */ Object zza() {
                        return sharedPreferences.getString("flag_configuration", JsonUtils.EMPTY_JSON);
                    }
                }));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a8 A[Catch: all -> 0x0172, TRY_ENTER, TryCatch #0 {all -> 0x0172, blocks: (B:20:0x0043, B:33:0x005e, B:35:0x0067, B:36:0x006f, B:38:0x0075, B:40:0x0085, B:42:0x009a, B:46:0x00a8, B:48:0x00ac, B:50:0x00bc, B:52:0x00d1, B:55:0x00dd, B:65:0x011c, B:69:0x0129, B:71:0x0136, B:73:0x0144, B:74:0x014d, B:76:0x015b, B:78:0x015f, B:79:0x0162, B:58:0x00ee, B:60:0x00fc, B:62:0x0104, B:63:0x010f, B:24:0x004a, B:28:0x0054), top: B:91:0x0043, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ac A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:20:0x0043, B:33:0x005e, B:35:0x0067, B:36:0x006f, B:38:0x0075, B:40:0x0085, B:42:0x009a, B:46:0x00a8, B:48:0x00ac, B:50:0x00bc, B:52:0x00d1, B:55:0x00dd, B:65:0x011c, B:69:0x0129, B:71:0x0136, B:73:0x0144, B:74:0x014d, B:76:0x015b, B:78:0x015f, B:79:0x0162, B:58:0x00ee, B:60:0x00fc, B:62:0x0104, B:63:0x010f, B:24:0x004a, B:28:0x0054), top: B:91:0x0043, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00dd A[Catch: all -> 0x0172, TRY_ENTER, TryCatch #0 {all -> 0x0172, blocks: (B:20:0x0043, B:33:0x005e, B:35:0x0067, B:36:0x006f, B:38:0x0075, B:40:0x0085, B:42:0x009a, B:46:0x00a8, B:48:0x00ac, B:50:0x00bc, B:52:0x00d1, B:55:0x00dd, B:65:0x011c, B:69:0x0129, B:71:0x0136, B:73:0x0144, B:74:0x014d, B:76:0x015b, B:78:0x015f, B:79:0x0162, B:58:0x00ee, B:60:0x00fc, B:62:0x0104, B:63:0x010f, B:24:0x004a, B:28:0x0054), top: B:91:0x0043, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ee A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:20:0x0043, B:33:0x005e, B:35:0x0067, B:36:0x006f, B:38:0x0075, B:40:0x0085, B:42:0x009a, B:46:0x00a8, B:48:0x00ac, B:50:0x00bc, B:52:0x00d1, B:55:0x00dd, B:65:0x011c, B:69:0x0129, B:71:0x0136, B:73:0x0144, B:74:0x014d, B:76:0x015b, B:78:0x015f, B:79:0x0162, B:58:0x00ee, B:60:0x00fc, B:62:0x0104, B:63:0x010f, B:24:0x004a, B:28:0x0054), top: B:91:0x0043, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00fc A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:20:0x0043, B:33:0x005e, B:35:0x0067, B:36:0x006f, B:38:0x0075, B:40:0x0085, B:42:0x009a, B:46:0x00a8, B:48:0x00ac, B:50:0x00bc, B:52:0x00d1, B:55:0x00dd, B:65:0x011c, B:69:0x0129, B:71:0x0136, B:73:0x0144, B:74:0x014d, B:76:0x015b, B:78:0x015f, B:79:0x0162, B:58:0x00ee, B:60:0x00fc, B:62:0x0104, B:63:0x010f, B:24:0x004a, B:28:0x0054), top: B:91:0x0043, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0120 A[Catch: all -> 0x017b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:7:0x0009, B:9:0x000d, B:11:0x000f, B:13:0x0014, B:14:0x0016, B:16:0x0028, B:17:0x002c, B:18:0x002e, B:43:0x009e, B:44:0x00a5, B:53:0x00d5, B:67:0x0120, B:80:0x0169, B:81:0x0170, B:84:0x0173, B:85:0x017a, B:20:0x0043, B:33:0x005e, B:35:0x0067, B:36:0x006f, B:38:0x0075, B:40:0x0085, B:42:0x009a, B:46:0x00a8, B:48:0x00ac, B:50:0x00bc, B:52:0x00d1, B:55:0x00dd, B:65:0x011c, B:69:0x0129, B:71:0x0136, B:73:0x0144, B:74:0x014d, B:76:0x015b, B:78:0x015f, B:79:0x0162, B:58:0x00ee, B:60:0x00fc, B:62:0x0104, B:63:0x010f, B:24:0x004a, B:28:0x0054), top: B:96:0x0009, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0129 A[Catch: all -> 0x0172, TRY_ENTER, TryCatch #0 {all -> 0x0172, blocks: (B:20:0x0043, B:33:0x005e, B:35:0x0067, B:36:0x006f, B:38:0x0075, B:40:0x0085, B:42:0x009a, B:46:0x00a8, B:48:0x00ac, B:50:0x00bc, B:52:0x00d1, B:55:0x00dd, B:65:0x011c, B:69:0x0129, B:71:0x0136, B:73:0x0144, B:74:0x014d, B:76:0x015b, B:78:0x015f, B:79:0x0162, B:58:0x00ee, B:60:0x00fc, B:62:0x0104, B:63:0x010f, B:24:0x004a, B:28:0x0054), top: B:91:0x0043, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0136 A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:20:0x0043, B:33:0x005e, B:35:0x0067, B:36:0x006f, B:38:0x0075, B:40:0x0085, B:42:0x009a, B:46:0x00a8, B:48:0x00ac, B:50:0x00bc, B:52:0x00d1, B:55:0x00dd, B:65:0x011c, B:69:0x0129, B:71:0x0136, B:73:0x0144, B:74:0x014d, B:76:0x015b, B:78:0x015f, B:79:0x0162, B:58:0x00ee, B:60:0x00fc, B:62:0x0104, B:63:0x010f, B:24:0x004a, B:28:0x0054), top: B:91:0x0043, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x015b A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:20:0x0043, B:33:0x005e, B:35:0x0067, B:36:0x006f, B:38:0x0075, B:40:0x0085, B:42:0x009a, B:46:0x00a8, B:48:0x00ac, B:50:0x00bc, B:52:0x00d1, B:55:0x00dd, B:65:0x011c, B:69:0x0129, B:71:0x0136, B:73:0x0144, B:74:0x014d, B:76:0x015b, B:78:0x015f, B:79:0x0162, B:58:0x00ee, B:60:0x00fc, B:62:0x0104, B:63:0x010f, B:24:0x004a, B:28:0x0054), top: B:91:0x0043, outer: #3 }] */
    public final void zza(Context context) {
        Context applicationContext;
        final SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        zzbjo zzbjoVar;
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzd) {
                return;
            }
            if (!this.zza) {
                this.zza = true;
            }
            this.zzi = TextUtils.equals(context.getPackageName(), "com.google.android.gms");
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.zzg = context;
            try {
                this.zzf = Wrappers.packageManager(context).getApplicationInfo(this.zzg.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            try {
                Context context2 = this.zzg;
                SharedPreferences sharedPreferencesZzb = null;
                if (context2 == null) {
                    context2 = null;
                } else {
                    try {
                        applicationContext = context2.createPackageContext("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        applicationContext = null;
                    }
                    if (applicationContext != null || (applicationContext = context2.getApplicationContext()) != null) {
                        context2 = applicationContext;
                    }
                }
                if (context2 != null) {
                    com.google.android.gms.ads.internal.client.zzba.zza();
                    sharedPreferencesZzb = zzbhx.zzb(context2);
                }
                if (sharedPreferencesZzb != null) {
                    zzbkw.zzc(new zzbhy(this, sharedPreferencesZzb));
                }
                if (!this.zzi) {
                    zzbjo zzbjoVar2 = zzbjw.zzd;
                    if (((Long) zzbjoVar2.zze()).longValue() > 0 && zzbhp.zzd(this.zzg) >= ((Long) zzbjoVar2.zze()).longValue()) {
                        this.zzj = true;
                        this.zzd = true;
                        this.zza = false;
                        this.zzc.open();
                    } else if (this.zzi) {
                        Context context3 = this.zzg;
                        if (!((Boolean) zzbke.zzk.zze()).booleanValue()) {
                            if (((Boolean) zzbke.zzl.zze()).booleanValue()) {
                                if (new JSONObject((String) zzbig.zza(new zzgto() { // from class: com.google.android.gms.internal.ads.zzbia
                                    @Override // com.google.android.gms.internal.ads.zzgto
                                    public final /* synthetic */ Object zza() {
                                        return sharedPreferences.getString("app_settings_json", JsonUtils.EMPTY_JSON);
                                    }
                                })).optBoolean("local_flags_enabled")) {
                                }
                            }
                            if (context2 == null) {
                                com.google.android.gms.ads.internal.client.zzba.zza();
                                this.zze = zzbhx.zzb(context2);
                                if (!this.zzi) {
                                    com.google.android.gms.ads.internal.client.zzba.zzd().zza(this.zzg);
                                }
                                if (!((Boolean) zzbke.zzc.zze()).booleanValue()) {
                                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                }
                                zzg(this.zze);
                                this.zzd = true;
                                this.zza = false;
                                this.zzc.open();
                                return;
                            }
                            this.zza = false;
                            this.zzc.open();
                        }
                        context2 = this.zzg;
                        if (context2 == null) {
                            com.google.android.gms.ads.internal.client.zzba.zza();
                            this.zze = zzbhx.zzb(context2);
                            if (!this.zzi) {
                                com.google.android.gms.ads.internal.client.zzba.zzd().zza(this.zzg);
                            }
                            if (!((Boolean) zzbke.zzc.zze()).booleanValue()) {
                                sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                            }
                            zzg(this.zze);
                            this.zzd = true;
                            this.zza = false;
                            this.zzc.open();
                            return;
                        }
                        this.zza = false;
                        this.zzc.open();
                    } else {
                        zzbjoVar = zzbjw.zzf;
                        if (((Long) zzbjoVar.zze()).longValue() > 0 || zzbhp.zzc(this.zzg) < ((Long) zzbjoVar.zze()).longValue()) {
                            Context context4 = this.zzg;
                            if (!((Boolean) zzbke.zzk.zze()).booleanValue()) {
                                if (((Boolean) zzbke.zzl.zze()).booleanValue() && (sharedPreferences = context4.getSharedPreferences("admob", 0)) != null) {
                                    try {
                                        if (new JSONObject((String) zzbig.zza(new zzgto() { // from class: com.google.android.gms.internal.ads.zzbia
                                            @Override // com.google.android.gms.internal.ads.zzgto
                                            public final /* synthetic */ Object zza() {
                                                return sharedPreferences.getString("app_settings_json", JsonUtils.EMPTY_JSON);
                                            }
                                        })).optBoolean("local_flags_enabled")) {
                                        }
                                    } catch (JSONException unused3) {
                                    }
                                }
                                if (context2 == null) {
                                    com.google.android.gms.ads.internal.client.zzba.zza();
                                    this.zze = zzbhx.zzb(context2);
                                    if (!this.zzi && ((Boolean) zzbke.zze.zze()).booleanValue()) {
                                        com.google.android.gms.ads.internal.client.zzba.zzd().zza(this.zzg);
                                    }
                                    if (!((Boolean) zzbke.zzc.zze()).booleanValue() && (sharedPreferences2 = this.zze) != null) {
                                        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                    }
                                    zzg(this.zze);
                                    this.zzd = true;
                                    this.zza = false;
                                    this.zzc.open();
                                    return;
                                }
                                this.zza = false;
                                this.zzc.open();
                            }
                            context2 = this.zzg;
                            if (context2 == null) {
                                com.google.android.gms.ads.internal.client.zzba.zza();
                                this.zze = zzbhx.zzb(context2);
                                if (!this.zzi) {
                                    com.google.android.gms.ads.internal.client.zzba.zzd().zza(this.zzg);
                                }
                                if (!((Boolean) zzbke.zzc.zze()).booleanValue()) {
                                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                }
                                zzg(this.zze);
                                this.zzd = true;
                                this.zza = false;
                                this.zzc.open();
                                return;
                            }
                            this.zza = false;
                            this.zzc.open();
                        } else {
                            this.zzj = true;
                            this.zzd = true;
                            this.zza = false;
                            this.zzc.open();
                        }
                    }
                } else if (this.zzi) {
                    zzbjoVar = zzbjw.zzf;
                    if (((Long) zzbjoVar.zze()).longValue() > 0) {
                        Context context5 = this.zzg;
                        if (!((Boolean) zzbke.zzk.zze()).booleanValue()) {
                            if (((Boolean) zzbke.zzl.zze()).booleanValue()) {
                                if (new JSONObject((String) zzbig.zza(new zzgto() { // from class: com.google.android.gms.internal.ads.zzbia
                                    @Override // com.google.android.gms.internal.ads.zzgto
                                    public final /* synthetic */ Object zza() {
                                        return sharedPreferences.getString("app_settings_json", JsonUtils.EMPTY_JSON);
                                    }
                                })).optBoolean("local_flags_enabled")) {
                                }
                            }
                            if (context2 == null) {
                                com.google.android.gms.ads.internal.client.zzba.zza();
                                this.zze = zzbhx.zzb(context2);
                                if (!this.zzi) {
                                    com.google.android.gms.ads.internal.client.zzba.zzd().zza(this.zzg);
                                }
                                if (!((Boolean) zzbke.zzc.zze()).booleanValue()) {
                                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                }
                                zzg(this.zze);
                                this.zzd = true;
                                this.zza = false;
                                this.zzc.open();
                                return;
                            }
                            this.zza = false;
                            this.zzc.open();
                        }
                        context2 = this.zzg;
                        if (context2 == null) {
                            com.google.android.gms.ads.internal.client.zzba.zza();
                            this.zze = zzbhx.zzb(context2);
                            if (!this.zzi) {
                                com.google.android.gms.ads.internal.client.zzba.zzd().zza(this.zzg);
                            }
                            if (!((Boolean) zzbke.zzc.zze()).booleanValue()) {
                                sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                            }
                            zzg(this.zze);
                            this.zzd = true;
                            this.zza = false;
                            this.zzc.open();
                            return;
                        }
                        this.zza = false;
                        this.zzc.open();
                    } else {
                        Context context6 = this.zzg;
                        if (!((Boolean) zzbke.zzk.zze()).booleanValue()) {
                            if (((Boolean) zzbke.zzl.zze()).booleanValue()) {
                                if (new JSONObject((String) zzbig.zza(new zzgto() { // from class: com.google.android.gms.internal.ads.zzbia
                                    @Override // com.google.android.gms.internal.ads.zzgto
                                    public final /* synthetic */ Object zza() {
                                        return sharedPreferences.getString("app_settings_json", JsonUtils.EMPTY_JSON);
                                    }
                                })).optBoolean("local_flags_enabled")) {
                                }
                            }
                            if (context2 == null) {
                                com.google.android.gms.ads.internal.client.zzba.zza();
                                this.zze = zzbhx.zzb(context2);
                                if (!this.zzi) {
                                    com.google.android.gms.ads.internal.client.zzba.zzd().zza(this.zzg);
                                }
                                if (!((Boolean) zzbke.zzc.zze()).booleanValue()) {
                                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                }
                                zzg(this.zze);
                                this.zzd = true;
                                this.zza = false;
                                this.zzc.open();
                                return;
                            }
                            this.zza = false;
                            this.zzc.open();
                        }
                        context2 = this.zzg;
                        if (context2 == null) {
                            com.google.android.gms.ads.internal.client.zzba.zza();
                            this.zze = zzbhx.zzb(context2);
                            if (!this.zzi) {
                                com.google.android.gms.ads.internal.client.zzba.zzd().zza(this.zzg);
                            }
                            if (!((Boolean) zzbke.zzc.zze()).booleanValue()) {
                                sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                            }
                            zzg(this.zze);
                            this.zzd = true;
                            this.zza = false;
                            this.zzc.open();
                            return;
                        }
                        this.zza = false;
                        this.zzc.open();
                    }
                } else {
                    Context context7 = this.zzg;
                    if (!((Boolean) zzbke.zzk.zze()).booleanValue()) {
                        if (((Boolean) zzbke.zzl.zze()).booleanValue()) {
                            if (new JSONObject((String) zzbig.zza(new zzgto() { // from class: com.google.android.gms.internal.ads.zzbia
                                @Override // com.google.android.gms.internal.ads.zzgto
                                public final /* synthetic */ Object zza() {
                                    return sharedPreferences.getString("app_settings_json", JsonUtils.EMPTY_JSON);
                                }
                            })).optBoolean("local_flags_enabled")) {
                            }
                        }
                        if (context2 == null) {
                            com.google.android.gms.ads.internal.client.zzba.zza();
                            this.zze = zzbhx.zzb(context2);
                            if (!this.zzi) {
                                com.google.android.gms.ads.internal.client.zzba.zzd().zza(this.zzg);
                            }
                            if (!((Boolean) zzbke.zzc.zze()).booleanValue()) {
                                sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                            }
                            zzg(this.zze);
                            this.zzd = true;
                            this.zza = false;
                            this.zzc.open();
                            return;
                        }
                        this.zza = false;
                        this.zzc.open();
                    }
                    context2 = this.zzg;
                    if (context2 == null) {
                        com.google.android.gms.ads.internal.client.zzba.zza();
                        this.zze = zzbhx.zzb(context2);
                        if (!this.zzi) {
                            com.google.android.gms.ads.internal.client.zzba.zzd().zza(this.zzg);
                        }
                        if (!((Boolean) zzbke.zzc.zze()).booleanValue()) {
                            sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                        }
                        zzg(this.zze);
                        this.zzd = true;
                        this.zza = false;
                        this.zzc.open();
                        return;
                    }
                    this.zza = false;
                    this.zzc.open();
                }
            } catch (Throwable th) {
                this.zza = false;
                this.zzc.open();
                throw th;
            }
        }
    }

    final boolean zzb() {
        return this.zzi;
    }

    public final boolean zzc() {
        return this.zzj;
    }

    public final Object zzd(final zzbhv zzbhvVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbhvVar.zzf();
            }
        }
        if (zzbhvVar.zzm() != 2) {
            return (zzbhvVar.zzm() == 1 && this.zzh.has(zzbhvVar.zze())) ? zzbhvVar.zzc(this.zzh) : zzbig.zza(new zzgto() { // from class: com.google.android.gms.internal.ads.zzbib
                @Override // com.google.android.gms.internal.ads.zzgto
                public final /* synthetic */ Object zza() {
                    return this.zza.zzf(zzbhvVar);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbhvVar.zzf() : zzbhvVar.zza(bundle);
    }

    public final Object zze(zzbhv zzbhvVar) {
        return (this.zzd || this.zza) ? zzd(zzbhvVar) : zzbhvVar.zzf();
    }

    final /* synthetic */ Object zzf(zzbhv zzbhvVar) {
        return zzbhvVar.zzd(this.zze);
    }
}
