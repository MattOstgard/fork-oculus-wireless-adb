package tdg.oculuswirelessadb

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent


class BootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (Intent.ACTION_BOOT_COMPLETED == intent.action) {
            // Intent to start an Activity, Service, etc.
            val startAppIntent = Intent(context, MainActivity::class.java)
            startAppIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(startAppIntent)
        }
    }
}
