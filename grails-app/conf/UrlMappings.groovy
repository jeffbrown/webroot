class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: "web")

        // it isn't clear what your real requirments are
        // so this may or may not be what you want
        "/signin"(controller: 'web', action: 'signin')

        "500"(view:'/error')
	}
}
