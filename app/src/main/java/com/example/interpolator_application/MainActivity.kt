package com.example.interpolator_application

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.View
import android.view.animation.*
import androidx.appcompat.app.AppCompatActivity
import com.example.interpolator_application.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val ANIMATION_DURATION = 2000
    private var animator: ObjectAnimator? = null
    private var binding: ActivityMainBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding!!.getRoot()
        setContentView(view)



        // Linear
        binding!!.linear.setOnClickListener { clickedView ->
            animator = ObjectAnimator.ofFloat(binding!!.linear, "translationX", 200f)
            animator?.setInterpolator(LinearInterpolator())
            animator?.setDuration(ANIMATION_DURATION.toLong())
            animator?.start()
        }


        // Accelerate
        binding!!.accelerate.setOnClickListener { clickedView ->
            animator = ObjectAnimator.ofFloat(binding!!.accelerate, "translationX", 200f)
            animator?.setInterpolator(AccelerateInterpolator())
            animator?.setDuration(ANIMATION_DURATION.toLong())
            animator?.start()
        }


        // Decelerate
        binding!!.decelerate.setOnClickListener { clickedView ->
            animator = ObjectAnimator.ofFloat(binding!!.decelerate, "translationX", 200f)
            animator?.setInterpolator(DecelerateInterpolator())
            animator?.setDuration(ANIMATION_DURATION.toLong())
            animator?.start()
        }



        // Bounce
        binding!!.bounce.setOnClickListener { clickedView ->
            animator = ObjectAnimator.ofFloat(binding!!.bounce, "translationX", 200f)
            animator?.setInterpolator(BounceInterpolator())
            animator?.setDuration(ANIMATION_DURATION.toLong())
            animator?.start()
        }



        // Overshoot
        binding!!.overshoot.setOnClickListener { clickedView ->
            animator = ObjectAnimator.ofFloat(binding!!.overshoot, "translationX", 200f)
            animator?.setInterpolator(OvershootInterpolator())
            animator?.setDuration(ANIMATION_DURATION.toLong())
            animator?.start()
        }



        // Anticipate
        binding!!.anticipate.setOnClickListener { clickedView ->
            animator = ObjectAnimator.ofFloat(binding!!.anticipate, "translationX", 200f)
            animator?.setInterpolator(AnticipateInterpolator())
            animator?.setDuration(ANIMATION_DURATION.toLong())
            animator?.start()
        }


        // Cycle
        binding!!.cycle.setOnClickListener { clickedView ->
            animator = ObjectAnimator.ofFloat(binding!!.cycle, "translationX", 200f)
            animator?.setInterpolator(CycleInterpolator(2F))
            animator?.setDuration(ANIMATION_DURATION.toLong())
            animator?.start()
        }


        // Accelerate Decelerate
        binding!!.accelerateDecelerate.setOnClickListener { clickedView ->
            animator = ObjectAnimator.ofFloat(binding!!.accelerateDecelerate, "translationX", 200f)
            animator?.setInterpolator(AccelerateDecelerateInterpolator())
            animator?.setDuration(ANIMATION_DURATION.toLong())
            animator?.start()
        }


        // Anticipate Overshoot
        binding!!.anticipateOvershoot.setOnClickListener { clickedView ->
            animator = ObjectAnimator.ofFloat(binding!!.anticipateOvershoot, "translationX", 200f)
            animator?.setInterpolator(AnticipateOvershootInterpolator())
            animator?.setDuration(ANIMATION_DURATION.toLong())
            animator?.start()
        }


    }



}