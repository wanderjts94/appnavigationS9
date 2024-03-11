package pe.edu.idat.appnavigations9

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.Toast
import pe.edu.idat.appnavigations9.databinding.FragmentPrincipalBinding


class PrincipalFragment : Fragment(),   OnClickListener {


    private  var _binding: FragmentPrincipalBinding?=null
    private val binding get()=_binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding=FragmentPrincipalBinding.inflate(inflater,container,false)
        binding.btnbuscar.setOnClickListener(this)
        return binding.root
    }

    override fun onClick(v: View?) {
        Toast.makeText(requireContext(), binding.etnombre.text.toString(),Toast.LENGTH_LONG).show()
    }


}