class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        //"/"(controller: "web")

        // it isn't clear what your real requirments are
        // so this may or may not be what you want
        //"/signin"(controller: 'web', action: 'signin')

        // You might also be looking for something like this instead
        // which may or may not be problematic depending on other
        // factors in your app...
        // "/$action"(controller: 'web')

        // is this what you want?
        "/$action?"(controller: "web")

        "500"(view:'/error')
	}
}
