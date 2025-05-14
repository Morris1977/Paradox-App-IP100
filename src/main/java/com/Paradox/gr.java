package com.Paradox;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.androidip.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class gr extends BaseExpandableListAdapter {
    private final HashMap a = new HashMap();
    private final HashMap b = new HashMap();
    private final Context c;
    private final Resources d;
    private final LayoutInflater e;
    private final int f;
    private final int g;
    private final cz h;

    public gr(Context context, int i, int i2, cz czVar) {
        this.c = context;
        this.d = this.c.getResources();
        this.e = (LayoutInflater) this.c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.f = i;
        this.g = i2;
        this.h = czVar;
        b();
    }

    private boolean a() {
        this.b.clear();
        this.a.clear();
        return true;
    }

    private boolean a(int i, ArrayList arrayList) {
        arrayList.trimToSize();
        if (((ArrayList) this.a.put(Integer.valueOf(i), arrayList)) != null) {
            return false;
        }
        this.b.put(Integer.valueOf(this.a.size() - 1), Integer.valueOf(i));
        return true;
    }

    private void b() {
        cz czVar = this.h;
        if (!czVar.T()) {
            a();
            return;
        }
        a();
        new ArrayList();
        if (czVar.U()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = czVar.m().iterator();
            while (it.hasNext()) {
                gy gyVar = (gy) it.next();
                if (gyVar.g()) {
                    arrayList2.add(gyVar);
                }
            }
            arrayList.add(new gv(this, R.string.Wirelesszonelowbattery, R.string.lowbattery, R.string.WirelessDevicesListedHaveLowBattery, arrayList2));
            a(R.string.Wirelesszonelowbattery, arrayList);
        }
        if (czVar.V()) {
            ArrayList arrayList3 = new ArrayList();
            if (czVar.ag()) {
                arrayList3.add(new gs(this, R.string.Power, R.string.Controlpanelbatteryfailure, R.string.ControlPanelBatteryDisconnected));
            }
            if (czVar.ah()) {
                arrayList3.add(new gs(this, R.string.Power, R.string.ControlpanelACfailure, R.string.PanelPowerFailure));
            }
            if (czVar.ai()) {
                arrayList3.add(new gs(this, R.string.Power, R.string.Controlpanelauxiliaryoverload, R.string.PanelAuxiliaryPowerOverload));
            }
            if (czVar.aj()) {
                arrayList3.add(new gs(this, R.string.Power, R.string.WirelesskeypadACfailure, R.string.WirelessKeypadPowerFailure));
            }
            if (czVar.ak()) {
                arrayList3.add(new gs(this, R.string.Power, R.string.Wirelesskeypadbatteryfailure, R.string.WirelessKeypadBatteryDisconnected));
            }
            if (czVar.al()) {
                arrayList3.add(new gs(this, R.string.Power, R.string.WirelessrepeaterACfailure, R.string.WirelessSirenBatteryIsDisconnected));
            }
            if (czVar.am()) {
                arrayList3.add(new gs(this, R.string.Power, R.string.Wirelessrepeaterbatteryfailure, R.string.WirelessSirenBatteryIsDisconnected));
            }
            if (czVar.an()) {
                arrayList3.add(new gs(this, R.string.Power, R.string.WirelesssirenACfailure, R.string.WirelessSirenPowerSourceFailure));
            }
            if (czVar.ao()) {
                arrayList3.add(new gs(this, R.string.Power, R.string.Wirelesssirenbatteryfailure, R.string.WirelessSirenBatteryIsDisconnected));
            }
            if (czVar.ap() && czVar.w != null) {
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = czVar.w.iterator();
                while (it2.hasNext()) {
                    dm dmVar = (dm) it2.next();
                    if (dmVar.h) {
                        arrayList4.add(dmVar);
                    }
                }
                arrayList3.add(new gt(this, R.string.ModuleACfailure, R.string.ACfailure, R.string.ModuleListedHavePowerFailure, arrayList4));
            }
            if (czVar.aq() && czVar.w != null) {
                ArrayList arrayList5 = new ArrayList();
                Iterator it3 = czVar.w.iterator();
                while (it3.hasNext()) {
                    dm dmVar2 = (dm) it3.next();
                    if (dmVar2.i) {
                        arrayList5.add(dmVar2);
                    }
                }
                arrayList3.add(new gt(this, R.string.Modulebatteryfailure, R.string.Batteryfailure, R.string.ModuleListedHaveLowBattery, arrayList5));
            }
            if (czVar.ar() && czVar.w != null) {
                ArrayList arrayList6 = new ArrayList();
                Iterator it4 = czVar.w.iterator();
                while (it4.hasNext()) {
                    dm dmVar3 = (dm) it4.next();
                    if (dmVar3.j) {
                        arrayList6.add(dmVar3);
                    }
                }
                arrayList3.add(new gt(this, R.string.Moduleauxiliaryoverload, R.string.Auxiliaryoverload, R.string.ModuleListedHaveAuxiliaryOverload, arrayList6));
            }
            a(R.string.Powertrouble, arrayList3);
        }
        if (czVar.W()) {
            ArrayList arrayList7 = new ArrayList();
            if (czVar.as()) {
                arrayList7.add(new gs(this, R.string.Bell, R.string.Controlpanelbelldisconnected, R.string.ControlPanelBellOrSirenDisconnected));
            }
            if (czVar.at()) {
                arrayList7.add(new gs(this, R.string.Bell, R.string.Controlpanelbelloverload, R.string.ControlPanelBellOutputOverloaded));
            }
            a(2131099823, arrayList7);
        }
        if (czVar.X()) {
            ArrayList arrayList8 = new ArrayList();
            if (czVar.au()) {
                arrayList8.add(new gs(this, R.string.Communication, R.string.Phonelinefailure_TLM_, R.string.ControlPanelIsUnableToAccessMainTel));
            }
            if (czVar.av()) {
                arrayList8.add(new gs(this, R.string.Communication, R.string.Landlinefailedtocommunicate_phone1_, R.string.ControlPanelFailedToComWithCentralStationPhone1));
            }
            if (czVar.aw()) {
                arrayList8.add(new gs(this, R.string.Communication, R.string.Landlinefailedtocommunicate_phone2_,  R.string.ControlPanelFailedToComWithCentralStationPhone2));
            }
            if (czVar.ax()) {
                arrayList8.add(new gs(this, R.string.Communication, R.string.Landlinefailedtocommunicate_phone3_, R.string.ControlPanelFailedToComWithCentralStationPhone3));
            }
            if (czVar.ay()) {
                arrayList8.add(new gs(this, R.string.Communication, R.string.Landlinefailedtocommunicate_phone4_, R.string.ControlPanelFailedToComWithCentralStationPhone4));
            }
            if (czVar.az()) {
                arrayList8.add(new gs(this, R.string.Communication, R.string.Pagercallfailedtocommunicate, R.string.ControlPanelFailedToComViaPager));
            }
            if (czVar.aA()) {
                arrayList8.add(new gs(this, R.string.Communication, R.string.Voicecallfailedtocommunicate, R.string.ControlPanelFailedToComViaVoiceCall));
            }
            if (czVar.aB()) {
                arrayList8.add(new gs(this, R.string.Communication, R.string.ControlpanelfailedtocommunicatewithPC, R.string.ControlPanelFailedToComWithPC));
            }
            if (czVar.aC()) {
                arrayList8.add(new gs(this, R.string.Communication, R.string.IPfailedtocommunicatewithIPreceiver1, R.string.ControlPanelFailedToComWithCentralStationViaIP1));
            }
            if (czVar.aD()) {
                arrayList8.add(new gs(this, R.string.Communication, R.string.IPfailedtocommunicatewithIPreceiver2, R.string.ControlPanelFailedToComWithCentralStationViaIP2));
            }
            if (czVar.aE()) {
                arrayList8.add(new gs(this, R.string.Communication, R.string.IPfailedtocommunicatewithIPreceiver3, R.string.ControlPanelFailedToComWithCentralStationViaIP3));
            }
            if (czVar.aF()) {
                arrayList8.add(new gs(this, R.string.Communication, R.string.IPfailedtocommunicatewithIPreceiver4, R.string.ControlPanelFailedToComWithCentralStationViaIP4));
            }
            if (czVar.aG()) {
                arrayList8.add(new gs(this, R.string.Communication, R.string.IPReceiverUnregistered_IP_GPRS_, R.string.SystemAttemptedToComWithIPReceiverNotRegistered));
            }
            if (czVar.aH()) {
                arrayList8.add(new gs(this, R.string.Communication, R.string.IPmodulenoservice_networkfailure_, R.string.NoServiceAvailableFromYourInternetProvider));
            }
            if (czVar.aI()) {
                arrayList8.add(new gs(this, R.string.Communication, R.string.GSMnoservice_networkfailure_, R.string.NoServiceAvailableFromYourGSMProvider));
            }
            a(R.string.Communicationtrouble, arrayList8);
        }
        if (czVar.Y()) {
            ArrayList arrayList9 = new ArrayList();
            ArrayList arrayList10 = new ArrayList();
            Iterator it5 = czVar.m().iterator();
            while (it5.hasNext()) {
                gy gyVar2 = (gy) it5.next();
                if (gyVar2.h()) {
                    arrayList10.add(gyVar2);
                }
            }
            arrayList9.add(new gv(this, R.string.Tamper, R.string.Tamperandzonewiringfailure, R.string.ZoneListedAreTampered, arrayList10));
            a(R.string.Tamperandzonewiringfailure, arrayList9);
        }
        if (czVar.Z()) {
            ArrayList arrayList11 = new ArrayList();
            if (czVar.aJ()) {
                ArrayList arrayList12 = new ArrayList();
                Iterator it6 = czVar.v.iterator();
                while (it6.hasNext()) {
                    dz dzVar = (dz) it6.next();
                    if (dzVar.d()) {
                        arrayList12.add(dzVar);
                    }
                }
                arrayList11.add(new gu(this, R.string.PGMtamper, R.string.Tamper, R.string.PGMListedAreTampered, arrayList12));
            }
            if (czVar.aK()) {
                arrayList11.add(new gs(this, R.string.Tamper, R.string.Moduletampertrouble, R.string.ModulesInSystemHaveBeenTampered));
            }
            if (czVar.aL()) {
                arrayList11.add(new gs(this, R.string.Tamper, R.string.Wirelesssirentampertrouble, R.string.WirelessSirensInSystemHaveBeenTampered));
            }
            a(R.string.Tamperandmodulewiringfailure, arrayList11);
        }
        if (czVar.ab()) {
            ArrayList arrayList13 = new ArrayList();
            ArrayList arrayList14 = new ArrayList();
            Iterator it7 = czVar.m().iterator();
            while (it7.hasNext()) {
                gy gyVar3 = (gy) it7.next();
                if (gyVar3.i()) {
                    arrayList14.add(gyVar3);
                }
            }
            arrayList13.add(new gv(this, R.string.Firelooptrouble, R.string.Fireloop, R.string.SmokeDetectorListedAreMissing, arrayList14));
            a(R.string.Firelooptrouble, arrayList13);
        }
        if (czVar.ac()) {
            ArrayList arrayList15 = new ArrayList();
            if (czVar.aM()) {
                arrayList15.add(new gs(this, R.string.Time, R.string.Timelost, R.string.SystemTimeAndDateMustBeReprogrammed));
            }
            a(R.string.Timetrouble, arrayList15);
        }
        if (czVar.aa()) {
            ArrayList arrayList16 = new ArrayList();
            arrayList16.add(new gs(this, R.string.Tampertrouble, R.string.Controlpaneltampertrouble, R.string.ControlPanelHasBeenTampered));
            a(R.string.Tampertrouble, arrayList16);
        }
        if (czVar.ad()) {
            ArrayList arrayList17 = new ArrayList();
            if (czVar.aO()) {
                ArrayList arrayList18 = new ArrayList();
                Iterator it8 = czVar.m().iterator();
                while (it8.hasNext()) {
                    gy gyVar4 = (gy) it8.next();
                    if (gyVar4.j()) {
                        arrayList18.add(gyVar4);
                    }
                }
                arrayList17.add(new gv(this, R.string.Wireless, R.string.Wirelesszonesupervisionlost, R.string.WirelessZoneListedFailedToCommunicate, arrayList18));
            }
            if (czVar.aN()) {
                arrayList17.add(new gs(this, R.string.Wireless, R.string.RFjammingtrouble, R.string.SystemHasDetectedWirelessRFJamming));
            }
            a(R.string.Wirelesssupervisionlost, arrayList17);
        }
        if (czVar.ae()) {
            ArrayList arrayList19 = new ArrayList();
            if (czVar.aP()) {
                ArrayList arrayList20 = new ArrayList();
                Iterator it9 = czVar.v.iterator();
                while (it9.hasNext()) {
                    dz dzVar2 = (dz) it9.next();
                    if (dzVar2.e()) {
                        arrayList20.add(dzVar2);
                    }
                }
                arrayList19.add(new gu(this, R.string.Module, R.string.WirelessPGMsupervisionlost, R.string.WirelessPGMListedFailedToCommunicate, arrayList20));
            }
            if (czVar.aQ()) {
                if (czVar.w != null) {
                    ArrayList arrayList21 = new ArrayList();
                    Iterator it10 = czVar.w.iterator();
                    while (it10.hasNext()) {
                        dm dmVar4 = (dm) it10.next();
                        if (dmVar4.c) {
                            arrayList21.add(dmVar4);
                        }
                    }
                    arrayList19.add(new gt(this, R.string.Module, R.string.Modulesupervisionlost, R.string.ModuleListedFailedToCommunicate, arrayList21));
                } else {
                    arrayList19.add(new gs(this, R.string.Module, R.string.Modulesupervisionlost, R.string.SystemModuleHasFailedToComWithControlPanel));
                }
            }
            if (czVar.aR()) {
                if (czVar.w != null) {
                    ArrayList arrayList22 = new ArrayList();
                    Iterator it11 = czVar.w.iterator();
                    while (it11.hasNext()) {
                        dm dmVar5 = (dm) it11.next();
                        if (dmVar5.g()) {
                            arrayList22.add(dmVar5);
                        }
                    }
                    arrayList19.add(new gt(this, R.string.Module, R.string.Keypadsupervisionlost, R.string.ModuleListedFailedToCommunicate, arrayList22));
                } else {
                    arrayList19.add(new gs(this, R.string.Module, R.string.Keypadsupervisionlost, R.string.SystemModuleHasFailedToComWithControlPanel));
                }
            }
            if (czVar.aS()) {
                arrayList19.add(new gs(this, R.string.Module, R.string.Repeatersupervisionlost, R.string.RepeaterModuleHasFailedToComWithControlPanel));
            }
            if (czVar.aT()) {
                arrayList19.add(new gs(this, R.string.Module, R.string.VDMP3supervisionlost, R.string.VDMP3mModuleHasFailedToComWithControlPanel));
            }
            if (czVar.aU()) {
                arrayList19.add(new gs(this, R.string.Module, R.string.PCSsupervisionlost, R.string.PCSModuleHasFailedToComWithControlPanel));
            }
            if (czVar.aV()) {
                arrayList19.add(new gs(this, R.string.Module, R.string.IPmodulesupervisionlost, R.string.IPModuleHasFailedToComWithControlPanel));
            }
            if (czVar.aW()) {
                arrayList19.add(new gs(this, R.string.Module, R.string.Sirensupervisionlost, R.string.SirenModuleHasFailedToComWithControlPanel));
            }
            a(R.string.Modulesupervisionlost, arrayList19);
        }
        if (czVar.af()) {
            a(R.string.Moduleintrouble, new ArrayList());
        }
    }

    public Object getChild(int i, int i2) {
        if (!this.b.containsKey(Integer.valueOf(i))) {
            return null;
        }
        return ((ArrayList) this.a.get(Integer.valueOf(((Integer) this.b.get(Integer.valueOf(i))).intValue()))).get(i2);
    }

    public long getChildId(int i, int i2) {
        return 0;
    }

    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.e.inflate(this.g, (ViewGroup) null);
        }
        TextView textView = (TextView) view.findViewById(R.id.tvTroubleRow);
        Object child = getChild(i, i2);
        if (child instanceof gs) {
            textView.setText(((gs) child).b.intValue());
        } else if (child instanceof gv) {
            textView.setText(((gv) child).b.intValue());
        } else if (child instanceof gu) {
            textView.setText(((gu) child).b.intValue());
        } else if (child instanceof gt) {
            textView.setText(((gt) child).b.intValue());
        }
        return view;
    }

    public int getChildrenCount(int i) {
        if (this.b.containsKey(Integer.valueOf(i))) {
            return ((ArrayList) this.a.get(this.b.get(Integer.valueOf(i)))).size();
        }
        return 0;
    }

    public Object getGroup(int i) {
        if (this.b.containsKey(Integer.valueOf(i))) {
            return this.a.get(this.b.get(Integer.valueOf(i)));
        }
        return null;
    }

    public int getGroupCount() {
        return this.a.size();
    }

    public long getGroupId(int i) {
        return 0;
    }

    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.e.inflate(this.f, (ViewGroup) null);
        }
        ((TextView) view.findViewById(R.id.tvTroubleParentRow)).setText(((Integer) this.b.get(Integer.valueOf(i))).intValue());
        return view;
    }

    public boolean hasStableIds() {
        return false;
    }

    public boolean isChildSelectable(int i, int i2) {
        return true;
    }

    public void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
