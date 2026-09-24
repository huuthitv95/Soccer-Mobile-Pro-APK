package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcok extends zzfda {
    final zzimr zza;
    final zzimr zzb;
    final zzimr zzc;
    final zzimr zzd;
    final zzimr zze;
    final zzimr zzf;
    final zzimr zzg;
    final zzimr zzh;
    final zzimr zzi;
    final zzimr zzj;
    final zzimr zzk;
    final zzimr zzl;
    final zzimr zzm;
    final zzimr zzn;
    final zzimr zzo;
    final zzimr zzp;
    final zzimr zzq;
    final zzimr zzr;
    final zzimr zzs;
    final zzimr zzt;
    final zzimr zzu;
    final zzimr zzv;
    final zzimr zzw;
    private final zzfed zzx;
    private final zzcol zzy;

    zzcok(zzcol zzcolVar, zzfed zzfedVar) {
        this.zzy = zzcolVar;
        this.zzx = zzfedVar;
        zzfee zzfeeVarZzc = zzfee.zzc(zzfedVar);
        this.zza = zzfeeVarZzc;
        this.zzb = zzfdv.zzc(zzcqv.zza, zzfno.zza(), zzfeeVarZzc);
        zzcqy zzcqyVar = zzcqx.zza;
        zzimr zzimrVar = zzcolVar.zzc;
        zzimr zzimrVar2 = zzcolVar.zzf;
        this.zzc = zzfec.zzc(zzcqyVar, zzimrVar, zzimrVar2);
        zzfef zzfefVarZzc = zzfef.zzc(zzfedVar);
        this.zzd = zzfefVarZzc;
        zzfeg zzfegVarZzc = zzfeg.zzc(zzfedVar);
        this.zze = zzfegVarZzc;
        zzfeh zzfehVarZzc = zzfeh.zzc(zzfedVar);
        this.zzf = zzfehVarZzc;
        this.zzg = zzfcz.zzc(zzcqz.zza, zzimrVar2, zzimrVar, zzfno.zza(), zzfefVarZzc, zzfegVarZzc, zzfehVarZzc);
        this.zzh = zzfet.zza(zzfno.zza());
        this.zzi = zzfdn.zzc(zzcqt.zza, zzfno.zza(), zzimrVar2);
        zzcqs zzcqsVar = zzcqr.zza;
        zzimr zzimrVar3 = zzcolVar.zzU;
        this.zzj = zzfdj.zzc(zzfeeVarZzc, zzcqsVar, zzimrVar3, zzimrVar, zzfno.zza());
        zzfej zzfejVarZzc = zzfej.zzc(zzfedVar);
        this.zzk = zzfejVarZzc;
        this.zzl = zzfep.zzc(zzimrVar3, zzfehVarZzc, zzcrb.zza, zzfno.zza(), zzfeeVarZzc, zzimrVar, zzfejVarZzc);
        this.zzm = zzimh.zza(zzfpt.zza(zzcolVar.zzG));
        zzfei zzfeiVarZzc = zzfei.zzc(zzfedVar);
        this.zzn = zzfeiVarZzc;
        zzimr zzimrVarZza = zzimh.zza(zzdxu.zza());
        this.zzo = zzimrVarZza;
        zzimr zzimrVarZza2 = zzimh.zza(zzdxs.zza());
        this.zzp = zzimrVarZza2;
        zzimr zzimrVarZza3 = zzimh.zza(zzdxw.zza());
        this.zzq = zzimrVarZza3;
        zzimr zzimrVarZza4 = zzimh.zza(zzdxy.zza());
        this.zzr = zzimrVarZza4;
        zziml zzimlVarZzc = zzimm.zzc(4);
        zzimlVarZzc.zzb(zzfos.GMS_SIGNALS, zzimrVarZza);
        zzimlVarZzc.zzb(zzfos.BUILD_URL, zzimrVarZza2);
        zzimlVarZzc.zzb(zzfos.HTTP, zzimrVarZza3);
        zzimlVarZzc.zzb(zzfos.PRE_PROCESS, zzimrVarZza4);
        zzimm zzimmVarZzc = zzimlVarZzc.zzc();
        this.zzs = zzimmVarZzc;
        zzimr zzimrVarZza5 = zzimh.zza(zzdxz.zza(zzfeiVarZzc, zzcolVar.zzf, zzfno.zza(), zzimmVarZzc));
        this.zzt = zzimrVarZza5;
        zzimt zzimtVarZza = zzimu.zza(0, 1);
        zzimtVarZza.zzb(zzimrVarZza5);
        zzimu zzimuVarZzc = zzimtVarZza.zzc();
        this.zzu = zzimuVarZzc;
        zzfpb zzfpbVarZzc = zzfpb.zzc(zzimuVarZzc);
        this.zzv = zzfpbVarZzc;
        this.zzw = zzimh.zza(zzfpa.zza(zzfno.zza(), zzcolVar.zzc, zzfpbVarZzc));
    }

    final zzfdx zza() {
        zzfed zzfedVar = this.zzx;
        zzbho zzbhoVarZza = zzcqp.zza();
        zzhbs zzhbsVarZzc = zzfno.zzc();
        List listZzd = zzfedVar.zzd();
        zzimq.zzb(listZzd);
        return new zzfdx(zzbhoVarZza, zzhbsVarZzc, listZzd);
    }

    final zzfdd zzb() {
        zzfed zzfedVar = this.zzx;
        return new zzfdd(zzcra.zza(), zzfno.zzc(), zzfedVar.zzb(), zzfedVar.zzc(), zzfedVar.zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzfda
    public final zzfcb zzc() {
        zzimr zzimrVar = this.zzb;
        zzcol zzcolVar = this.zzy;
        Context contextZzd = zzcng.zzd(zzcolVar.zzI());
        zzhbs zzhbsVarZzc = zzfno.zzc();
        zzfdt zzfdtVarZzb = ((zzfdv) zzimrVar).zzb();
        zzimr zzimrVar2 = zzcolVar.zzc;
        return new zzfcb(contextZzd, zzhbsVarZzc, zzgwj.zzn(new zzfak(zzfdtVarZzb, 0L, (ScheduledExecutorService) zzimrVar2.zzb()), new zzfak(((zzfec) this.zzc).zzb(), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfe)).longValue(), (ScheduledExecutorService) zzimrVar2.zzb()), new zzfak(((zzfcz) this.zzg).zzb(), 0L, (ScheduledExecutorService) zzimrVar2.zzb()), new zzfak(zzfet.zzc(), 0L, (ScheduledExecutorService) zzimrVar2.zzb()), ((zzfdn) this.zzi).zzb(), zza(), zzb(), (zzfby) zzcolVar.zzbD.zzb(), ((zzfdj) this.zzj).zzb(), ((zzfep) this.zzl).zzb()), (zzfps) this.zzm.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzfda
    public final zzfcb zzd() {
        zzimr zzimrVar = this.zzm;
        zzimr zzimrVar2 = this.zzj;
        zzimr zzimrVar3 = this.zzl;
        zzimr zzimrVar4 = this.zzh;
        zzimr zzimrVar5 = this.zzc;
        zzimr zzimrVar6 = this.zzb;
        zzimr zzimrVar7 = this.zzi;
        zzimr zzimrVar8 = this.zzg;
        zzcol zzcolVar = this.zzy;
        return zzfek.zza(zzcng.zzd(zzcolVar.zzI()), zzcqw.zza(), zzcrc.zza(), zzcolVar.zzbD.zzb(), zzb(), zza(), zzimh.zzc(zzimrVar8), zzimh.zzc(zzimrVar7), zzimh.zzc(zzimrVar6), zzimh.zzc(zzimrVar5), zzimh.zzc(zzimrVar4), zzimh.zzc(zzimrVar3), zzimh.zzc(zzimrVar2), zzfno.zzc(), (zzfps) zzimrVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzfda
    public final zzfoy zze() {
        return (zzfoy) this.zzw.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfda
    public final zzfps zzf() {
        return (zzfps) this.zzm.zzb();
    }
}
