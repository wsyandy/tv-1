package hr.cloudwalk.currweather;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

public class BaseActivity extends Activity {
	final static String TAG = "TVW BaseActivity";
	Menu menu = null;
	Integer[] menuIds = { R.id.sat_radar_munje_menu_item, R.id.sat24_menu_item, R.id.sat24_eu_menu_item, R.id.sat24_ir_menu_item, R.id.sat24_eu_ir_menu_item,
			R.id.bilogora_menu_item, R.id.osijek_menu_item, R.id.slo_menu_item, R.id.slo_tuca_menu_item, R.id.munje_menu_item, R.id.koka_menu_item,
			R.id.jap_menu_item, R.id.sljeme_menu_item, R.id.skewt_zg, R.id.skewt_sinj, R.id.skewt_ri, R.id.skewt_go, R.id.meteogrami3d_zg_vz_pj,
			R.id.meteogrami3d_ri_sinj_mo, R.id.meteogrami4d_zg_vz_pj, R.id.meteogrami4d_os_ri_sinj, R.id.gfs_mr850_thw, R.id.aladin_hr, R.id.aladin_danas,
			R.id.aladin_sutra, R.id.aladin2_danas, R.id.aladin2_sutra, R.id.aladin2_prekosutra, R.id.aladin2_temp2m, R.id.naoblaka_ma, R.id.kondenzacija_ma,
			R.id.wind_mi, R.id.naoblaka_mi, R.id.kondenzacija_mi, R.id.dhmz_danas_sutra, R.id.dhmz4d, R.id.webcam1, R.id.webcam_slo, R.id.yrno,
			R.id.nasa_menu_item, R.id.terra_menu_item, R.id.aqua_menu_item, R.id.meteoalarm_hr, R.id.meteoalarm_si, R.id.pelud_uv_ugoda,
			R.id.arso_jutri_pojutri, R.id.webcam_slo2, R.id.meteo_fvg_menu_item, R.id.gfs_mr850_thw0, R.id.cape_ma, R.id.cape_mi, R.id.dhmz7d_zg_vz_ri,
			R.id.dhmz7d_pu_os_st, R.id.aladin_senj, R.id.aladin_masl, R.id.aladin_spli, R.id.aladin_dubr, R.id.pljusak, R.id.najave, R.id.nasa_web_menu_item,
			R.id.meteoadriatic_zg_vz_ri, R.id.meteoadriatic_pu_os_st, R.id.kompozitni_menu_item, R.id.raspadalica_menu_item, R.id.webcam2, R.id.aladin_hr_ob,
			R.id.ens_zg_vz_ri, R.id.ens_pu_os_st, R.id.ens_zg_vz_ri_2, R.id.ens_pu_os_st_2, R.id.napoved_letalstvo, R.id.yrno2, R.id.webcam_slo3,
			R.id.dhmz_akt, R.id.dhmz_danas_sutra_w, R.id.olc_danas, R.id.dhmz_danas_sutra_zg, R.id.ucka_menu_item };

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.options_menu, menu);
		this.menu = menu;
		return true;
	};

	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		return true;
	}

}