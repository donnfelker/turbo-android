package dev.hotwire.turbo.demo.features.web

import dev.hotwire.turbo.demo.base.NavDestination
import dev.hotwire.turbo.demo.util.SIGN_IN_URL
import dev.hotwire.turbo.fragments.TurboWebFragment
import dev.hotwire.turbo.nav.TurboNavGraphDestination

@TurboNavGraphDestination(uri = "turbo://fragment/web")
open class WebFragment : TurboWebFragment(), NavDestination {
    override fun onVisitErrorReceived(location: String, errorCode: Int) {
        when (errorCode) {
            401 -> navigate(SIGN_IN_URL)
            else -> super.onVisitErrorReceived(location, errorCode)
        }
    }
}
