package myapp

class WebController {

    def index() {
        render view: 'index'
    }

    def signin() {
        render view: 'signin'
    }
}
