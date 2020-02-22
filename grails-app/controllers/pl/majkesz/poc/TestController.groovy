package pl.majkesz.poc

import pl.majkesz.Spaced

class TestController {

	def index() {
		Spaced spaced
		Spaced.withTransaction {
			spaced = Spaced.findOrCreateByDescription(' with preceding space')
			spaced.save()
		}
		render spaced?.id
	}

	def test() {
		Spaced spaced
		Spaced.withTransaction {
			spaced = Spaced.findOrCreateByDescription(' with preceding space'.trim())
			spaced.save()
		}
		render spaced?.id
	}
}
