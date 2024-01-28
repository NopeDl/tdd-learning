package main

import "testing"

func TestMultiplication(t *testing.T) {
	fiver := Dollar{
		amount: 5,
	}

	tenner := fiver.Times(2)

	if tenner.amount != 10 {
		t.Errorf("Expected 10, got: [%d]", tenner.amount)
	}
}

type Dollar struct {
	amount int
}

func (self *Dollar) Times(time int) *Dollar {
	return &Dollar{self.amount * time}
}
